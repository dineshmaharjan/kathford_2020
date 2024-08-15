//
//  ViewController.swift
//  CalculationExample
//
//  Created by Dinesh Maharjan on 15/08/2024.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var firstNumberTextField: UITextField!
    
    @IBOutlet weak var secondNumberTextField: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func calculateButton(_ sender: UIButton) {
        
        var firstNumber = Int(firstNumberTextField.text!)!
        var secondNumber = Int(secondNumberTextField.text!)!
        
        var sum = firstNumber + secondNumber
        
        print(factorial(numb: 5))
        
    }
    
    func factorial(numb: Int)-> Int{
        
        
        if(numb == 0){
            return 1
        }else{
            return numb * factorial(numb: numb - 1)
        }
    }
    
    
    func areaOfSquare(length: Int) -> Int{
        return (length * length)
    }
    
}

