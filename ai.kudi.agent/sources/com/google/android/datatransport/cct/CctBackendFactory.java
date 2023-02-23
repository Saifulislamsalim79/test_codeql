package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC2639h;
import com.google.android.datatransport.runtime.backends.InterfaceC2633d;
import com.google.android.datatransport.runtime.backends.InterfaceC2645m;
@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements InterfaceC2633d {
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC2633d
    public InterfaceC2645m create(AbstractC2639h abstractC2639h) {
        return new C2584d(abstractC2639h.mo32463b(), abstractC2639h.mo32460e(), abstractC2639h.mo32461d());
    }
}
