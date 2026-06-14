package com.nettakrim.signed_paintings.access;

import com.nettakrim.signed_paintings.rendering.PaintingInfo;
import com.nettakrim.signed_paintings.rendering.SignSideInfo;

public interface SignBlockEntityAccessor {
    PaintingInfo signedPaintings$getFrontPaintingInfo();

    PaintingInfo signedPaintings$getBackPaintingInfo();

    SignSideInfo signedPaintings$getSideInfo(boolean front);

    boolean signedPaintings$hasSignSideInfo(SignSideInfo info);

    void signedPaintings$reloadIfNeeded();
}
