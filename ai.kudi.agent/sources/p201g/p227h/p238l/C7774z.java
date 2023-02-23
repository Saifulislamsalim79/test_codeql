package p201g.p227h.p238l;

import android.os.Build;
import android.view.ViewGroup;
import p201g.p227h.C7601c;
/* compiled from: ViewGroupCompat.java */
/* renamed from: g.h.l.z */
/* loaded from: classes2.dex */
public final class C7774z {
    /* renamed from: a */
    public static boolean m17435a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C7601c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C7759x.m17543M(viewGroup) == null) ? false : true;
    }
}
