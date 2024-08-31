/**
 * Submits the user form and retrieves the values of the form elements.
 */
function submitForm() {
    const form = document.getElementById('userForm');
    const isMale = form.elements['isMale'].value === 'true';
    const isEmployed = form.elements['isEmployed'].value === 'true';
    const isYoungerThan40 = form.elements['isYoungerThan40'].value === 'true';
    const likesCoding = form.elements['likesCoding'].value === 'true';

    const responses = [isMale, isEmployed];
}