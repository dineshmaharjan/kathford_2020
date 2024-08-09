package np.edu.divyagyan.sqliteexample.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import np.edu.divyagyan.sqliteexample.StudentModel;

public class StudentDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "student.db";
    private static final int DATABASE_VERSION = 1;
    private static final String STUDENT_TABLE = "student";
    private static final String FULL_NAME = "full_name";
    private static final String ADDRESS = "address";

    private static final String STUDENT_TABLE_QUERY =
            "CREATE TABLE student ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "full_name Text, address TEXT )";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS student";

    public StudentDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(STUDENT_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }


    public long insert(StudentModel studentModel) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(FULL_NAME, studentModel.getFullName());
        contentValues.put(ADDRESS, studentModel.getAddress());

        return sqLiteDatabase.insert(STUDENT_TABLE, null, contentValues);
    }


    public ArrayList<StudentModel> getAllStudent() {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + STUDENT_TABLE, null);
        ArrayList<StudentModel> studentModels = new ArrayList<>();
        if (cursor.moveToFirst()) {
            while (cursor.moveToNext()) {
                StudentModel studentModel = new StudentModel();
                studentModel.setId(cursor.getInt(0));
                studentModel.setFullName(cursor.getString(1));
                studentModel.setAddress(cursor.getString(2));


                studentModels.add(studentModel);
            }

        }
        cursor.close();
        return studentModels;
    }

    public int updateStudent(StudentModel studentModel) {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(FULL_NAME, studentModel.getFullName());
        contentValues.put(ADDRESS, studentModel.getAddress());

        int rowId= sqLiteDatabase.update(STUDENT_TABLE, contentValues,
                "id=?",
                new String[]{String.valueOf(studentModel.getId())});

        sqLiteDatabase.close();
        return rowId;
    }


    public int delete(StudentModel studentModel) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        int rowId=sqLiteDatabase.delete(STUDENT_TABLE,"id=?",
                new String[]{String.valueOf(studentModel.getId())} );
        sqLiteDatabase.close();
        return rowId;
    }

}
