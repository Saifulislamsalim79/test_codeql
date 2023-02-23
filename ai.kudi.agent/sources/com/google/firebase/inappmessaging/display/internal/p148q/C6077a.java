package com.google.firebase.inappmessaging.display.internal.p148q;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.C6028g;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6371c;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
/* compiled from: BannerBindingWrapper.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.a */
/* loaded from: classes2.dex */
public class C6077a extends AbstractC6079c {

    /* renamed from: d */
    private FiamFrameLayout f14845d;

    /* renamed from: e */
    private ViewGroup f14846e;

    /* renamed from: f */
    private TextView f14847f;

    /* renamed from: g */
    private ResizableImageView f14848g;

    /* renamed from: h */
    private TextView f14849h;

    /* renamed from: i */
    private View.OnClickListener f14850i;

    public C6077a(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        super(c6057l, layoutInflater, abstractC6386i);
    }

    /* renamed from: l */
    private void m22795l(View.OnClickListener onClickListener) {
        this.f14846e.setOnClickListener(onClickListener);
    }

    /* renamed from: m */
    private void m22794m(C6057l c6057l) {
        int min = Math.min(c6057l.m22870u().intValue(), c6057l.m22871t().intValue());
        ViewGroup.LayoutParams layoutParams = this.f14845d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = min;
        this.f14845d.setLayoutParams(layoutParams);
        this.f14848g.setMaxHeight(c6057l.m22873r());
        this.f14848g.setMaxWidth(c6057l.m22872s());
    }

    /* renamed from: n */
    private void m22793n(C6371c c6371c) {
        if (!TextUtils.isEmpty(c6371c.m22195f())) {
            m22785j(this.f14846e, c6371c.m22195f());
        }
        this.f14848g.setVisibility((c6371c.mo22150b() == null || TextUtils.isEmpty(c6371c.mo22150b().m22160b())) ? 8 : 0);
        if (c6371c.m22193h() != null) {
            if (!TextUtils.isEmpty(c6371c.m22193h().m22116c())) {
                this.f14849h.setText(c6371c.m22193h().m22116c());
            }
            if (!TextUtils.isEmpty(c6371c.m22193h().m22117b())) {
                this.f14849h.setTextColor(Color.parseColor(c6371c.m22193h().m22117b()));
            }
        }
        if (c6371c.m22194g() != null) {
            if (!TextUtils.isEmpty(c6371c.m22194g().m22116c())) {
                this.f14847f.setText(c6371c.m22194g().m22116c());
            }
            if (TextUtils.isEmpty(c6371c.m22194g().m22117b())) {
                return;
            }
            this.f14847f.setTextColor(Color.parseColor(c6371c.m22194g().m22117b()));
        }
    }

    /* renamed from: o */
    private void m22792o(View.OnClickListener onClickListener) {
        this.f14850i = onClickListener;
        this.f14845d.setDismissListener(onClickListener);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: a */
    public boolean mo22788a() {
        return true;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: b */
    public C6057l mo22770b() {
        return this.f14855b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: c */
    public View mo22769c() {
        return this.f14846e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: d */
    public View.OnClickListener mo22783d() {
        return this.f14850i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: e */
    public ImageView mo22768e() {
        return this.f14848g;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: f */
    public ViewGroup mo22767f() {
        return this.f14845d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo22766g(Map<C6365a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f14856c.inflate(C6028g.banner, (ViewGroup) null);
        this.f14845d = (FiamFrameLayout) inflate.findViewById(C6027f.banner_root);
        this.f14846e = (ViewGroup) inflate.findViewById(C6027f.banner_content_root);
        this.f14847f = (TextView) inflate.findViewById(C6027f.banner_body);
        this.f14848g = (ResizableImageView) inflate.findViewById(C6027f.banner_image);
        this.f14849h = (TextView) inflate.findViewById(C6027f.banner_title);
        if (this.f14854a.m22151c().equals(MessageType.BANNER)) {
            C6371c c6371c = (C6371c) this.f14854a;
            m22793n(c6371c);
            m22794m(this.f14855b);
            m22792o(onClickListener);
            m22795l(map.get(c6371c.m22196e()));
        }
        return null;
    }
}
