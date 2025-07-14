// script.js

function calculate(operation) {
  const num1 = parseFloat(document.getElementById('num1').value);
  const num2 = parseFloat(document.getElementById('num2').value);
  let result = '';

  if (isNaN(num1) || isNaN(num2)) {
    result = 'Please enter valid numbers';
  } else {
    switch (operation) {
      case 'add':
        result = `Result: ${num1 + num2}`;
        break;
      case 'subtract':
        result = `Result: ${num1 - num2}`;
        break;
      case 'multiply':
        result = `Result: ${num1 * num2}`;
        break;
      case 'divide':
        result = num2 !== 0 ? `Result: ${num1 / num2}` : 'Cannot divide by zero';
        break;
    }
  }
  document.getElementById('result').innerText = result;
}