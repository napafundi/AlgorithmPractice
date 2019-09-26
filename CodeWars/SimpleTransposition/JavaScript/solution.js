function simpleTransposition(text) {
    var row1 = [];
    var row2 = [];
    for (i = 0; i < text.length; i++) {
        if (i % 2 == 0) {
            row1.push(text[i]);
        } else {
            row2.push(text[i]);
        }
    }
    return row1.join('') + row2.join('');
}

module.exports = { simpleTransposition }