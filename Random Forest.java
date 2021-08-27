
Scheme:       weka.classifiers.trees.RandomForest -P 100 -I 100 -num-slots 1 -K 0 -M 1.0 -V 0.001 -S 1
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         144               95.3642 %
Incorrectly Classified Instances         7                4.6358 %
Kappa statistic                          0.9419
Mean absolute error                      0.1636
Root mean squared error                  0.2402
Relative absolute error                 61.2236 %
Root relative squared error             65.7787 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.976    0.027    0.930      0.976    0.952      0.935    0.990     0.933     basal
                 0.900    0.017    0.931      0.900    0.915      0.895    0.980     0.953     HER
                 1.000    0.000    1.000      1.000    1.000      1.000    1.000     1.000     cell_line
                 0.857    0.000    1.000      0.857    0.923      0.923    1.000     1.000     normal
                 0.966    0.008    0.966      0.966    0.966      0.957    0.996     0.988     luminal_A
                 0.967    0.008    0.967      0.967    0.967      0.958    0.986     0.909     luminal_B
Weighted Avg.    0.954    0.014    0.954      0.954    0.953      0.941    0.990     0.952     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 40  1  0  0  0  0 |  a = basal
  3 27  0  0  0  0 |  b = HER
  0  0 14  0  0  0 |  c = cell_line
  0  0  0  6  1  0 |  d = normal
  0  0  0  0 28  1 |  e = luminal_A
  0  1  0  0  0 29 |  f = luminal_B