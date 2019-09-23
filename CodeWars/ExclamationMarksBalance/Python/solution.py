def balance(left, right):
    left = sum([
        2 if x == "!"
        else 3
        for x in left
    ])
    right = sum([
        2 if x == "!"
        else 3
        for x in right
    ])
    if (left == right):
        return "Balance"
    elif (left > right):
        return "Left"
    else:
        return "Right"