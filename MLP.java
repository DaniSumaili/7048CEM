

Scheme:       weka.classifiers.functions.MultilayerPerceptron -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H 10
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances          88               58.2781 %
Incorrectly Classified Instances        63               41.7219 %
Kappa statistic                          0.4821
Mean absolute error                      0.1454
Root mean squared error                  0.2792
Relative absolute error                 54.419  %
Root relative squared error             76.4436 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.610    0.009    0.962      0.610    0.746      0.708    0.895     0.783     basal
                 0.567    0.017    0.895      0.567    0.694      0.662    0.904     0.800     HER
                 1.000    0.000    1.000      1.000    1.000      1.000    1.000     1.000     cell_line
                 0.429    0.000    1.000      0.429    0.600      0.646    0.943     0.692     normal
                 1.000    0.492    0.326      1.000    0.492      0.407    0.785     0.483     luminal_A
                 0.000    0.000    ?          0.000    ?          ?        0.837     0.571     luminal_B
Weighted Avg.    0.583    0.100    ?          0.583    ?          ?        0.876     0.703     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 25  2  0  0 14  0 |  a = basal
  1 17  0  0 12  0 |  b = HER
  0  0 14  0  0  0 |  c = cell_line
  0  0  0  3  4  0 |  d = normal
  0  0  0  0 29  0 |  e = luminal_A
  0  0  0  0 30  0 |  f = luminal_B