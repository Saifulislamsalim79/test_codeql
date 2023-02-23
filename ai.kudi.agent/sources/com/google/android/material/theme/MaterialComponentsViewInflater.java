package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0967k;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1085d;
import androidx.appcompat.widget.C1097f;
import androidx.appcompat.widget.C1129o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C4795g;
import com.google.android.material.textview.MaterialTextView;
import p272h.p286c.p287a.p323c.p332q.C9298a;
import p272h.p286c.p287a.p323c.p341y.C9317a;
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C0967k {
    @Override // androidx.appcompat.app.C0967k
    /* renamed from: b */
    protected C1085d mo26265b(Context context, AttributeSet attributeSet) {
        return new C4795g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0967k
    /* renamed from: c */
    protected AppCompatButton mo26264c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0967k
    /* renamed from: d */
    protected C1097f mo26263d(Context context, AttributeSet attributeSet) {
        return new C9298a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0967k
    /* renamed from: j */
    protected C1129o mo26262j(Context context, AttributeSet attributeSet) {
        return new C9317a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0967k
    /* renamed from: n */
    protected AppCompatTextView mo26261n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
