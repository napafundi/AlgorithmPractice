function balance(left,right){
    var leftSum = 0;
    var rightSum = 0;
    
    for (var c of left) {
      if (c == '!') {
        leftSum += 2;
      } else {
        leftSum += 3;
      }
    }
    
    for (var c of right) {
      if (c == '!') {
        rightSum += 2;
      } else {
        rightSum += 3;
      }
    }
    
    if (leftSum > rightSum) {
      return "Left";
    } else if (leftSum < rightSum) {
      return "Right";
    } else {
      return "Balance";
    }
  }

  module.exports = { balance }