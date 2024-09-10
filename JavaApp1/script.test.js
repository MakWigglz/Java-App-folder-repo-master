// Test case 1: All form elements are true
const form1 = {
  elements: {
    'isMale': { value: 'true' },
    'isEmployed': { value: 'true' },
    'isYoungerThan40': { value: 'true' },
    'likesCoding': { value: 'true' }
  }
};
console.log(submitForm(form1)); // Output: [true, true]

// Test case 2: All form elements are false
const form2 = {
  elements: {
    'isMale': { value: 'false' },
    'isEmployed': { value: 'false' },
    'isYoungerThan40': { value: 'false' },
    'likesCoding': { value: 'false' }
  }
};
console.log(submitForm(form2)); // Output: [false, false]

// Test case 3: Mixed form elements
const form3 = {
  elements: {
    'isMale': { value: 'true' },
    'isEmployed': { value: 'false' },
    'isYoungerThan40': { value: 'true' },
    'likesCoding': { value: 'false' }
  }
};
console.log(submitForm(form3)); // Output: [true, false]