def deep_count(a):
    sum = 0
    for e in a:
        sum += 1
        if ( isinstance(e, list) ):
            sum += deep_count(e)
    return sum