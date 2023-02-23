package com.google.android.play.core.install;

import com.google.android.play.core.install.p108c.C4956a;
import com.google.android.play.core.tasks.AbstractC5018j;
/* loaded from: classes2.dex */
public class InstallException extends AbstractC5018j {
    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i), C4956a.m25960a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
