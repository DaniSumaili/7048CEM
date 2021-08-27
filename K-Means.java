

Scheme:       weka.clusterers.SimpleKMeans -init 0 -max-candidates 100 -periodic-pruning 10000 
			  -min-density 2.0 -t1 -1.25 -t2 -1.0 -N 6 -A "weka.core.EuclideanDistance -R first-last" 
			  -I 500 -num-slots 1 -S 10
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    Classes to clusters evaluation on training data

=== Model and evaluation on training set ===

Clustered Instances

0       35 ( 23%)
1       14 (  9%)
2       36 ( 24%)
3       19 ( 13%)
4        6 (  4%)
5       41 ( 27%)


Class attribute: class
Classes to Clusters:

  0  1  2  3  4  5  <-- assigned to cluster
 29  0 12  0  0  0 | basal
  6  0 24  0  0  0 | HER
  0 14  0  0  0  0 | cell_line
  0  0  0  1  6  0 | normal
  0  0  0  7  0 22 | luminal_A
  0  0  0 11  0 19 | luminal_B

Cluster 0 <-- basal
Cluster 1 <-- cell_line
Cluster 2 <-- HER
Cluster 3 <-- luminal_B
Cluster 4 <-- normal
Cluster 5 <-- luminal_A

Incorrectly clustered instances :	45.0	 29.8013 %
