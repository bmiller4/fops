BEGIN {
    fn = ""
}

/^[ \t]+public( static)? [[:alnum:]]+ [[:alnum:]]+\(/ {
    if (fn != FILENAME) {
        fn = FILENAME
        tmp = FILENAME
        sub(/.*\//, "", tmp)
        print tmp
    }
    sub(/^[ \t]+/, "\t")
    print
}
