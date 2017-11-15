#!/usr/bin/python3

# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.



# file_name is Path/to/file
def read_input(file_name):
    with open(file_name, 'r') as content_file:
        content = content_file.read()
    return content



def find (value, disjoint_set):
    disjoint_set_list = list(disjoint_set)
    return disjoint_set_list.index(value)


def merge (hashSet, disjoint_set, value_one, value_two):

    # PSEUDO

    # wList = a.find(two)
    res  = list(find(value_two, disjoint_set))

    working_list = hashSet(res)
    for item in working_list:
        disjoint_set[item] = value_one
        working_list[item].append(value_two)
    del hashSet[value_two]



if __name__ == "__main__":
    file_location = "/home/robert/PycharmProjects/find/Graph.txt"
    file_contents = read_input(file_location)

    hash_set = dict("abcdefg")
    for item in hash_set:
        hash_set[item][item] = dict()


    disjoint_set = dict("hijklmn")
    value_one = "b"
    value_two = "a"
    value_index = find(value_one, hash_set)

    merge(hash_set, disjoint_set, value_one, value_two)

