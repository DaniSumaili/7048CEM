

Scheme:       weka.clusterers.HierarchicalClusterer -N 6 -L SINGLE -P -A "weka.core.EuclideanDistance -R first-last"
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    Classes to clusters evaluation on training data

=== Model and evaluation on training set ===

Clustered Instances

0      137 ( 91%)
1       10 (  7%)
2        1 (  1%)
3        1 (  1%)
4        1 (  1%)
5        1 (  1%)


Class attribute: class
Classes to Clusters:

  0  1  2  3  4  5  <-- assigned to cluster
 41  0  0  0  0  0 | basal
 30  0  0  0  0  0 | HER
  0 10  1  1  1  1 | cell_line
  7  0  0  0  0  0 | normal
 29  0  0  0  0  0 | luminal_A
 30  0  0  0  0  0 | luminal_B

Cluster 0 <-- basal
Cluster 1 <-- cell_line
Cluster 2 <-- No class
Cluster 3 <-- No class
Cluster 4 <-- No class
Cluster 5 <-- No class

Incorrectly clustered instances :	100.0	 66.2252 %