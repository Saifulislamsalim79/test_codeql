package com.google.firebase.inappmessaging.display.internal.p148q;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.C6028g;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6387j;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
/* compiled from: ModalBindingWrapper.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.h */
/* loaded from: classes2.dex */
public class C6085h extends AbstractC6079c {

    /* renamed from: d */
    private FiamRelativeLayout f14879d;

    /* renamed from: e */
    private ViewGroup f14880e;

    /* renamed from: f */
    private ScrollView f14881f;

    /* renamed from: g */
    private Button f14882g;

    /* renamed from: h */
    private View f14883h;

    /* renamed from: i */
    private ImageView f14884i;

    /* renamed from: j */
    private TextView f14885j;

    /* renamed from: k */
    private TextView f14886k;

    /* renamed from: l */
    private C6387j f14887l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f14888m;

    /* compiled from: ModalBindingWrapper.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.q.h$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC6086a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC6086a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C6085h.this.f14884i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public C6085h(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        super(c6057l, layoutInflater, abstractC6386i);
        this.f14888m = new ViewTreeObserver$OnGlobalLayoutListenerC6086a();
    }

    /* renamed from: m */
    private void m22764m(Map<C6365a, View.OnClickListener> map) {
        C6365a m22148e = this.f14887l.m22148e();
        if (m22148e != null && m22148e.m22201c() != null && !TextUtils.isEmpty(m22148e.m22201c().m22184c().m22116c())) {
            AbstractC6079c.m22784k(this.f14882g, m22148e.m22201c());
            m22787h(this.f14882g, map.get(this.f14887l.m22148e()));
            this.f14882g.setVisibility(0);
            return;
        }
        this.f14882g.setVisibility(8);
    }

    /* renamed from: n */
    private void m22763n(View.OnClickListener onClickListener) {
        this.f14883h.setOnClickListener(onClickListener);
        this.f14879d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m22762o(C6057l c6057l) {
        this.f14884i.setMaxHeight(c6057l.m22873r());
        this.f14884i.setMaxWidth(c6057l.m22872s());
    }

    /* renamed from: p */
    private void m22761p(C6387j c6387j) {
        if (c6387j.mo22150b() != null && !TextUtils.isEmpty(c6387j.mo22150b().m22160b())) {
            this.f14884i.setVisibility(0);
        } else {
            this.f14884i.setVisibility(8);
        }
        if (c6387j.m22145h() != null) {
            if (!TextUtils.isEmpty(c6387j.m22145h().m22116c())) {
                this.f14886k.setVisibility(0);
                this.f14886k.setText(c6387j.m22145h().m22116c());
            } else {
                this.f14886k.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c6387j.m22145h().m22117b())) {
                this.f14886k.setTextColor(Color.parseColor(c6387j.m22145h().m22117b()));
            }
        }
        if (c6387j.m22146g() != null && !TextUtils.isEmpty(c6387j.m22146g().m22116c())) {
            this.f14881f.setVisibility(0);
            this.f14885j.setVisibility(0);
            this.f14885j.setTextColor(Color.parseColor(c6387j.m22146g().m22117b()));
            this.f14885j.setText(c6387j.m22146g().m22116c());
            return;
        }
        this.f14881f.setVisibility(8);
        this.f14885j.setVisibility(8);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: b */
    public C6057l mo22770b() {
        return this.f14855b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: c */
    public View mo22769c() {
        return this.f14880e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: e */
    public ImageView mo22768e() {
        return this.f14884i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: f */
    public ViewGroup mo22767f() {
        return this.f14879d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo22766g(Map<C6365a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f14856c.inflate(C6028g.modal, (ViewGroup) null);
        this.f14881f = (ScrollView) inflate.findViewById(C6027f.body_scroll);
        this.f14882g = (Button) inflate.findViewById(C6027f.button);
        this.f14883h = inflate.findViewById(C6027f.collapse_button);
        this.f14884i = (ImageView) inflate.findViewById(C6027f.image_view);
        this.f14885j = (TextView) inflate.findViewById(C6027f.message_body);
        this.f14886k = (TextView) inflate.findViewById(C6027f.message_title);
        this.f14879d = (FiamRelativeLayout) inflate.findViewById(C6027f.modal_root);
        this.f14880e = (ViewGroup) inflate.findViewById(C6027f.modal_content_root);
        if (this.f14854a.m22151c().equals(MessageType.MODAL)) {
            C6387j c6387j = (C6387j) this.f14854a;
            this.f14887l = c6387j;
            m22761p(c6387j);
            m22764m(map);
            m22762o(this.f14855b);
            m22763n(onClickListener);
            m22785j(this.f14880e, this.f14887l.m22147f());
        }
        return this.f14888m;
    }
}
