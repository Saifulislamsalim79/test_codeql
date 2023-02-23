package org.org.org.org.org.p602ui;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* renamed from: org.org.org.org.org.ui.Label */
/* loaded from: classes.dex */
public final class Label {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:22:0x009e */
    /* JADX WARN: Incorrect condition in loop: B:27:0x00be */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m534a(java.util.List r38, android.view.View r39, android.graphics.Rect r40, java.lang.String r41, boolean r42, int r43, java.lang.Integer r44, java.lang.String r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.Label.m534a(java.util.List, android.view.View, android.graphics.Rect, java.lang.String, boolean, int, java.lang.Integer, java.lang.String, boolean):int");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ int m533a(Label label, List list, View view, Rect $r3, String $r4, boolean $z0, int $i0, Integer $r5, String $r6, boolean $z1, int i, Object obj) {
        int $i2 = i & 4;
        if ($i2 != 0) {
            $r3 = null;
        }
        int $i22 = i & 8;
        if ($i22 != 0) {
            $r4 = null;
        }
        int $i23 = i & 16;
        if ($i23 != 0) {
            $z0 = true;
        }
        int $i24 = i & 32;
        if ($i24 != 0) {
            $i0 = 0;
        }
        int $i25 = i & 64;
        if ($i25 != 0) {
            $r5 = null;
        }
        int $i26 = i & 128;
        if ($i26 != 0) {
            $r6 = null;
        }
        int $i1 = i & 256;
        if ($i1 != 0) {
            $z1 = false;
        }
        return label.m534a(list, view, $r3, $r4, $z0, $i0, $r5, $r6, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Integer m537a(View view, View view2, Integer $r3) {
        boolean $z0 = view instanceof RecyclerView;
        if ($z0) {
            RecyclerView $r4 = (RecyclerView) view;
            int $i0 = $r4.m35302e0(view2);
            return Integer.valueOf($i0);
        } else if ($r3 != null) {
            return $r3;
        } else {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m536a(View view, Integer num) {
        if (num == null) {
            int $i0 = view.hashCode();
            String $r4 = String.valueOf($i0);
            return $r4;
        }
        StringBuilder $r2 = new StringBuilder();
        int $i02 = view.hashCode();
        $r2.append($i02);
        $r2.append('_');
        $r2.append(num);
        String $r42 = $r2.toString();
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m535a(View view, String str, String str2) {
        boolean $z0 = view instanceof RecyclerView;
        if (!$z0) {
            boolean $z02 = view instanceof ScrollView;
            if (!$z02) {
                boolean $z03 = view instanceof HorizontalScrollView;
                if ($z03) {
                    return str;
                }
                if (str2 != null) {
                    return str2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final boolean m532b(View view) {
        boolean $z0 = view instanceof WebView;
        if ($z0) {
            return true;
        }
        boolean $z02 = view instanceof DatePicker;
        if ($z02) {
            return true;
        }
        boolean $z03 = view instanceof TimePicker;
        if ($z03) {
            return true;
        }
        boolean $z04 = view instanceof CalendarView;
        return $z04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final List m538a(View view) {
        List $r1;
        Log_OC.getArray(view, "view");
        ArrayList $r3 = new ArrayList();
        m533a(this, $r3, view, null, null, false, 0, null, null, false, 508, null);
        $r1 = C13742z.m3825B0($r3);
        return $r1;
    }
}
