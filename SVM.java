
Scheme:       weka.classifiers.functions.SMO -C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K 
			  "weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007"
			  -calibrator "weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4"
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         142               94.0397 %
Incorrectly Classified Instances         9                5.9603 %
Kappa statistic                          0.9255
Mean absolute error                      0.2235
Root mean squared error                  0.3124
Relative absolute error                 83.6469 %
Root relative squared error             85.5554 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.927    0.009    0.974      0.927    0.950      0.933    0.985     0.944     basal
                 0.967    0.025    0.906      0.967    0.935      0.920    0.981     0.889     HER
                 1.000    0.000    1.000      1.000    1.000      1.000    1.000     1.000     cell_line
                 0.857    0.000    1.000      0.857    0.923      0.923    1.000     1.000     normal
                 0.931    0.025    0.900      0.931    0.915      0.895    0.978     0.870     luminal_A
                 0.933    0.017    0.933      0.933    0.933      0.917    0.980     0.899     luminal_B
Weighted Avg.    0.940    0.015    0.942      0.940    0.941      0.925    0.984     0.918     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 38  3  0  0  0  0 |  a = basal
  1 29  0  0  0  0 |  b = HER
  0  0 14  0  0  0 |  c = cell_line
  0  0  0  6  1  0 |  d = normal
  0  0  0  0 27  2 |  e = luminal_A
  0  0  0  0  2 28 |  f = luminal_B