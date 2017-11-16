#!/usr/bin/python3

# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.



# file_name is Path/to/file
def read_input(file_name):
    with open(file_name, 'r') as content_file:
        content = content_file.read()
    return content


# http://www.geeksforgeeks.org/union-find/
# A utility function to find the subset of an element i
def find_parent(parent, i):
    if parent[i] == -1:
        return i
    if parent[i] != -1:
        return find_parent(parent, parent[i])

# http://www.geeksforgeeks.org/union-find/
# A utility function to do union of two subsets
def union(parent,x,y):
    x_set = find_parent(parent, x)
    y_set = find_parent(parent, y)
    parent[x_set] = y_set

def connectivity(x, y):

    # find minimum of x and y

    # if both in disjoin set return true
    return 0


if __name__ == "__main__":
    file_location = "/home/robert/PycharmProjects/find/Graph.txt"
    file_location = "/home/robert/PycharmProjects/find/dummy.txt"
    file_contents = read_input(file_location)

    # should now containt a list of all the graph edges
    # with each entry looking like
    # 11111, 222222
    graph_edge_list = file_contents.split('\n')

    # Remove last element

    del graph_edge_list[len(graph_edge_list) - 1]

    total_set = set()

    for item in graph_edge_list:
        result_array = item.split(',')
        total_set.add(result_array[0])
        total_set.add(result_array[1])

    print(total_set)
    dict_pairs = dict()

    for item in total_set:
        dict_pairs[item] = item

    print(dict_pairs)
    # at this point the graph should be in a list, prepared for union merge
