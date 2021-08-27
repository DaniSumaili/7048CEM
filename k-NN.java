

Scheme:       weka.classifiers.lazy.IBk -K 1 -W 0 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\""
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         121               80.1325 %
Incorrectly Classified Instances        30               19.8675 %
Kappa statistic                          0.7529
Mean absolute error                      0.0781
Root mean squared error                  0.2509
Relative absolute error                 29.2328 %
Root relative squared error             68.6964 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.707    0.018    0.935      0.707    0.806      0.759    0.870     0.781     basal
                 0.900    0.091    0.711      0.900    0.794      0.744    0.910     0.689     HER
                 1.000    0.000    1.000      1.000    1.000      1.000    1.000     1.000     cell_line
                 0.857    0.000    1.000      0.857    0.923      0.923    0.905     0.864     normal
                 1.000    0.123    0.659      1.000    0.795      0.760    0.934     0.642     luminal_A
                 0.533    0.017    0.889      0.533    0.667      0.636    0.747     0.590     luminal_B
Weighted Avg.    0.801    0.050    0.837      0.801    0.797      0.762    0.879     0.722     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 29 11  0  0  0  1 |  a = basal
  2 27  0  0  0  1 |  b = HER
  0  0 14  0  0  0 |  c = cell_line
  0  0  0  6  1  0 |  d = normal
  0  0  0  0 29  0 |  e = luminal_A
  0  0  0  0 14 16 |  f = luminal_B