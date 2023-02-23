package com.google.firebase.inappmessaging.display.internal.p148q;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1365a;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6374d;
import java.util.Map;
/* compiled from: BindingWrapper.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6079c {

    /* renamed from: a */
    protected final AbstractC6386i f14854a;

    /* renamed from: b */
    final C6057l f14855b;

    /* renamed from: c */
    final LayoutInflater f14856c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6079c(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        this.f14855b = c6057l;
        this.f14856c = layoutInflater;
        this.f14854a = abstractC6386i;
    }

    /* renamed from: i */
    public static void m22786i(Button button, String str) {
        try {
            Drawable m36184r = C1365a.m36184r(button.getBackground());
            C1365a.m36188n(m36184r, Color.parseColor(str));
            button.setBackground(m36184r);
        } catch (IllegalArgumentException e) {
            C6065m.m22817e("Error parsing background color: " + e.toString());
        }
    }

    /* renamed from: k */
    public static void m22784k(Button button, C6374d c6374d) {
        String m22117b = c6374d.m22184c().m22117b();
        m22786i(button, c6374d.m22185b());
        button.setText(c6374d.m22184c().m22116c());
        button.setTextColor(Color.parseColor(m22117b));
    }

    /* renamed from: a */
    public boolean mo22788a() {
        return false;
    }

    /* renamed from: b */
    public C6057l mo22770b() {
        return this.f14855b;
    }

    /* renamed from: c */
    public abstract View mo22769c();

    /* renamed from: d */
    public View.OnClickListener mo22783d() {
        return null;
    }

    /* renamed from: e */
    public abstract ImageView mo22768e();

    /* renamed from: f */
    public abstract ViewGroup mo22767f();

    /* renamed from: g */
    public abstract ViewTreeObserver.OnGlobalLayoutListener mo22766g(Map<C6365a, View.OnClickListener> map, View.OnClickListener onClickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m22787h(Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m22785j(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            C6065m.m22817e("Error parsing background color: " + e.toString() + " color: " + str);
        }
    }
}
