
Scheme:       weka.classifiers.bayes.NaiveBayes -D
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         141               93.3775 %
Incorrectly Classified Instances        10                6.6225 %
Kappa statistic                          0.9172
Mean absolute error                      0.0221
Root mean squared error                  0.1486
Relative absolute error                  8.2601 %
Root relative squared error             40.6843 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.927    0.009    0.974      0.927    0.950      0.933    0.971     0.940     basal
                 0.933    0.041    0.848      0.933    0.889      0.861    0.962     0.827     HER
                 1.000    0.000    1.000      1.000    1.000      1.000    1.000     1.000     cell_line
                 0.857    0.000    1.000      0.857    0.923      0.923    0.929     0.864     normal
                 0.931    0.008    0.964      0.931    0.947      0.935    0.978     0.938     luminal_A
                 0.933    0.025    0.903      0.933    0.918      0.897    0.990     0.930     luminal_B
Weighted Avg.    0.934    0.017    0.937      0.934    0.934      0.918    0.975     0.917     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 38  3  0  0  0  0 |  a = basal
  1 28  0  0  0  1 |  b = HER
  0  0 14  0  0  0 |  c = cell_line
  0  0  0  6  1  0 |  d = normal
  0  0  0  0 27  2 |  e = luminal_A
  0  2  0  0  0 28 |  f = luminal_B