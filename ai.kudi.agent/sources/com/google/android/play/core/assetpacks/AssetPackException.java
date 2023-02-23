package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.p107z2.C4949a;
import com.google.android.play.core.tasks.AbstractC5018j;
/* loaded from: classes2.dex */
public class AssetPackException extends AbstractC5018j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), C4949a.m25973a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
