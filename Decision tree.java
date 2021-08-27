

Scheme:       weka.classifiers.trees.J48 -C 0.25 -M 2
Relation:     Breast/GSE45827/Breast_GSE45827.arff
Instances:    151
Attributes:   54676
              [list of attributes omitted]
Test mode:    3-fold cross-validation

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         121               80.1325 %
Incorrectly Classified Instances        30               19.8675 %
Kappa statistic                          0.752 
Mean absolute error                      0.07  
Root mean squared error                  0.2554
Relative absolute error                 26.1975 %
Root relative squared error             69.9401 %
Total Number of Instances              151     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.902    0.064    0.841      0.902    0.871      0.821    0.926     0.789     basal
                 0.733    0.025    0.880      0.733    0.800      0.761    0.843     0.703     HER
                 0.786    0.022    0.786      0.786    0.786      0.764    0.882     0.637     cell_line
                 0.714    0.035    0.500      0.714    0.588      0.575    0.840     0.370     normal
                 0.793    0.041    0.821      0.793    0.807      0.762    0.890     0.705     luminal_A
                 0.767    0.058    0.767      0.767    0.767      0.709    0.863     0.639     luminal_B
Weighted Avg.    0.801    0.045    0.809      0.801    0.803      0.759    0.882     0.693     

=== Confusion Matrix ===

  a  b  c  d  e  f   <-- classified as
 37  2  1  1  0  0 |  a = basal
  5 22  0  0  0  3 |  b = HER
  0  0 11  3  0  0 |  c = cell_line
  1  0  1  5  0  0 |  d = normal
  1  0  1  0 23  4 |  e = luminal_A
  0  1  0  1  5 23 |  f = luminal_B
