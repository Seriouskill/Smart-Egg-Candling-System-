package com.candling_system.org.smart_egg;

import android.graphics.Bitmap;

public interface ICognitiveServicesClassifier {
    Classifier.Recognition classifyImage(Bitmap sourceImage, int orientation);
    void close();
}
