function deepCount(arr) {
    var sum = 0;
    for (var obj of arr) {
        sum++;
        if (Array.isArray(obj)) {
            sum += deepCount(obj);
        }
    }
    return sum;
}

module.exports = { deepCount }