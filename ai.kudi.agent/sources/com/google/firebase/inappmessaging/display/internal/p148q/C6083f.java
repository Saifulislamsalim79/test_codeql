package com.google.firebase.inappmessaging.display.internal.p148q;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.C6027f;
import com.google.firebase.inappmessaging.display.C6028g;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6383h;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
/* compiled from: ImageBindingWrapper.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.f */
/* loaded from: classes2.dex */
public class C6083f extends AbstractC6079c {

    /* renamed from: d */
    private FiamFrameLayout f14872d;

    /* renamed from: e */
    private ViewGroup f14873e;

    /* renamed from: f */
    private ImageView f14874f;

    /* renamed from: g */
    private Button f14875g;

    public C6083f(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        super(c6057l, layoutInflater, abstractC6386i);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: c */
    public View mo22769c() {
        return this.f14873e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: e */
    public ImageView mo22768e() {
        return this.f14874f;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: f */
    public ViewGroup mo22767f() {
        return this.f14872d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c
    /* renamed from: g */
    public ViewTreeObserver.OnGlobalLayoutListener mo22766g(Map<C6365a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View inflate = this.f14856c.inflate(C6028g.image, (ViewGroup) null);
        this.f14872d = (FiamFrameLayout) inflate.findViewById(C6027f.image_root);
        this.f14873e = (ViewGroup) inflate.findViewById(C6027f.image_content_root);
        this.f14874f = (ImageView) inflate.findViewById(C6027f.image_view);
        this.f14875g = (Button) inflate.findViewById(C6027f.collapse_button);
        this.f14874f.setMaxHeight(this.f14855b.m22873r());
        this.f14874f.setMaxWidth(this.f14855b.m22872s());
        if (this.f14854a.m22151c().equals(MessageType.IMAGE_ONLY)) {
            C6383h c6383h = (C6383h) this.f14854a;
            this.f14874f.setVisibility((c6383h.mo22150b() == null || TextUtils.isEmpty(c6383h.mo22150b().m22160b())) ? 8 : 0);
            this.f14874f.setOnClickListener(map.get(c6383h.m22156e()));
        }
        this.f14872d.setDismissListener(onClickListener);
        this.f14875g.setOnClickListener(onClickListener);
        return null;
    }
}
