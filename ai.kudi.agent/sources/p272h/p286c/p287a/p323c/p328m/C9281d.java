package p272h.p286c.p287a.p323c.p328m;

import android.util.Property;
import android.view.ViewGroup;
import p272h.p286c.p287a.p323c.C9271f;
/* compiled from: ChildrenAlphaProperty.java */
/* renamed from: h.c.a.c.m.d */
/* loaded from: classes2.dex */
public class C9281d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f21812a = new C9281d("childrenAlpha");

    private C9281d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C9271f.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C9271f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
