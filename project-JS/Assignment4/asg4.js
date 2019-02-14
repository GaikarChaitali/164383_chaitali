var fs = require('fs');

fs.appendFile('mynewfile1.txt', 'hey hello , lets Go', function (err) {
  if (err) throw err;
  console.log('new file created!');
});