package com.google.firebase.inappmessaging.display.internal.p148q;

import android.graphics.Color;
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
import com.google.firebase.inappmessaging.display.internal.layout.AbstractC6059a;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6378f;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
/* compiled from: CardBindingWrapper.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.d */
/* loaded from: classes2.dex */
public class C6080d extends AbstractC6079c {

    /* renamed from: d */
    private FiamCardView f14857d;

    /* renamed from: e */
    private AbstractC6059a f14858e;

    /* renamed from: f */
    private ScrollView f14859f;

    /* renamed from: g */
    private Button f14860g;

    /* renamed from: h */
    private Button f14861h;

    /* renamed from: i */
    private ImageView f14862i;

    /* renamed from: j */
    private TextView f14863j;

    /* renamed from: k */
    private TextView f14864k;

    /* renamed from: l */
    private C6378f f14865l;

    /* renamed from: m */
    private View.OnClickListener f14866m;

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f14867n;

    /* compiled from: CardBindingWrapper.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.q.d$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC6081a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC6081a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C6080d.this.f14862i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public C6080d(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        super(c6057l, layoutInflater, abstractC6386i);
        this.f14867n = new ViewTreeObserver$OnGlobalLayoutListenerC6081a();
    }

    /* renamed from: m */
    private void m22781m(Map<C6365a, View.OnClickListener> map) {
        C6365a m22172i = this.f14865l.m22172i();
        C6365a m22171j = this.f14865l.m22171j();
        AbstractC6079c.m22784k(this.f14860g, m22172i.m22201c());
        m22787h(this.f14860g, map.get(m22172i));
        this.f14860g.setVisibility(0);
        if (m22171j != null && m22171j.m22201c() != null) {
            AbstractC6079c.m22784k(this.f14861h, m22171j.m22201c());
            m22787h(this.f14861h, map.get(m22171j));
            this.f14861h.setVisibility(0);
            return;
        }
        this.f14861h.setVisibility(8);
    }

    /* renamed from: n */
    private void m22780n(View.OnClickListener onClickListener) {
        this.f14866m = onClickListener;
        this.f14857d.setDismissListener(onClickListener);
    }

    /* renamed from: o */
    private void m22779o(C6378f c6378f) {
        if (c6378f.m22173h() == null && c6378f.m22174g() == null) {
            this.f14862i.setVisibility(8);
        } else {
            this.f14862i.setVisibility(0);
        }
    }

    /* renamed from: p */
    private void m22778p(C6057l c6057l) {
        this.f14862i.setMaxHeight(c6057l.m22873r());
        this.f14862i.setMaxWidth(c6057l.m22872s());
    }

    /* renamed from: q */
    private void m22777q(C6378f c6378f) {
        this.f14864k.setText(c6378f.m22170k().m22116c());
        this.f14864k.setTextColor(Color.parseColor(c6378f.m22170k().m22117b()));
        if (c6378f.m22175f() != null && c6378f.m22175f().m22116c() != null) {
            this.f14859f.setVisibility(0);
            this.f14863j.setVisibility(0);
            this.f14863j.setText(c6378f.m22175f().m22116c());
            this.f14863j.setTextColor(Color.parseColor(c6378f.m22175f().m22117b()));
            return;
        }
        this.f14859f.setVisibility(8);
        this.f14863j.setVisibility(8);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: b */
    public C6057l mo22770b() {
        return this.f14855b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: c */
    public View mo22769c() {
        return this.f14858e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: d */
    public View.OnClickListener mo22783d() {
        return this.f14866m;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: e */
    public ImageView mo22768e() {
        return this.f14862i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: f */
    public ViewGroup mo22767f() {
        return this.f14857d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo22766g(Map<C6365a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f14856c.inflate(C6028g.card, (ViewGroup) null);
        this.f14859f = (ScrollView) inflate.findViewById(C6027f.body_scroll);
        this.f14860g = (Button) inflate.findViewById(C6027f.primary_button);
        this.f14861h = (Button) inflate.findViewById(C6027f.secondary_button);
        this.f14862i = (ImageView) inflate.findViewById(C6027f.image_view);
        this.f14863j = (TextView) inflate.findViewById(C6027f.message_body);
        this.f14864k = (TextView) inflate.findViewById(C6027f.message_title);
        this.f14857d = (FiamCardView) inflate.findViewById(C6027f.card_root);
        this.f14858e = (AbstractC6059a) inflate.findViewById(C6027f.card_content_root);
        if (this.f14854a.m22151c().equals(MessageType.CARD)) {
            C6378f c6378f = (C6378f) this.f14854a;
            this.f14865l = c6378f;
            m22777q(c6378f);
            m22779o(this.f14865l);
            m22781m(map);
            m22778p(this.f14855b);
            m22780n(onClickListener);
            m22785j(this.f14858e, this.f14865l.m22176e());
        }
        return this.f14867n;
    }
}
