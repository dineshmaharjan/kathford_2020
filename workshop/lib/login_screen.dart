import 'package:flutter/material.dart';

class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key});

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Login Screen"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Text('Login'),
            TextFormField(
              decoration: InputDecoration(
                label: Text("Email"),
              ),
            ),
            SizedBox(
              height: 16,
            ),
            TextFormField(
              obscureText: true,
              decoration: InputDecoration(
                label: Text("Password"),
              ),
            ),
            SizedBox(
              height: 16,
            ),
            ElevatedButton(onPressed: () {

            },
                child: Text("Signup")),
          ],
        ),
      ),
    );
  }
}
