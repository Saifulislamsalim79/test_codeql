package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* compiled from: EndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes2.dex */
abstract class AbstractC4792e {

    /* renamed from: a */
    TextInputLayout f12121a;

    /* renamed from: b */
    Context f12122b;

    /* renamed from: c */
    CheckableImageButton f12123c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4792e(TextInputLayout textInputLayout) {
        this.f12121a = textInputLayout;
        this.f12122b = textInputLayout.getContext();
        this.f12123c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo26277a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo26326b(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26325c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26324d() {
        return false;
    }
}
