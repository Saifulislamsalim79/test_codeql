package org.org.org.org.asm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.smartlook.sdk.smartlook.C7206R;
import com.smartlook.sdk.smartlook.core.api.model.SmartlookNamedController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.util.C14619f;
/* loaded from: classes.dex */
public final class Type {

    /* renamed from: b */
    public static ArrayList<e.a.a.a.f.u.i> f32311b;

    /* renamed from: c */
    public static final Type f32312c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        f32312c = $r0;
        ArrayList $r1 = new ArrayList();
        f32311b = $r1;
    }

    private Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[EDGE_INSN: B:16:0x002d->B:14:0x002d ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View m1150a(android.view.ViewGroup r11, int r12, int r13) {
        /*
            r10 = this;
            r1 = 0
            java.util.List r0 = org.org.org.org.asm.util.Frame.m1054a(r11, r1)
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r4 = r2.next()
            r5 = r4
            r7 = r4
            android.view.View r7 = (android.view.View) r7
            r6 = r7
            org.org.org.org.asm.Type r10 = org.org.org.org.asm.Type.f32312c
            boolean r3 = r10.get(r12, r13, r6)
            if (r3 == 0) goto L28
            int r8 = r6.getVisibility()
            if (r8 != 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == 0) goto L9
            goto L2d
        L2c:
            r5 = 0
        L2d:
            r9 = r5
            android.view.View r9 = (android.view.View) r9
            r6 = r9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Type.m1150a(android.view.ViewGroup, int, int):android.view.View");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0049 */
    /* JADX WARN: Incorrect condition in loop: B:16:0x007a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m1155a(int r26, android.view.View r27, int r28) {
        /*
            r25 = this;
            if (r27 == 0) goto Lab
            r0 = r27
            r1 = r26
            java.lang.Object r3 = r0.getTag(r1)
            if (r3 == 0) goto L11
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            return r4
        L11:
            if (r28 <= 0) goto Lab
            r0 = r27
            boolean r6 = r0 instanceof android.view.ViewGroup
            if (r6 == 0) goto Lab
            r8 = r27
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r7 = r8
            int r9 = r7.getChildCount()
            r11 = 0
            kotlin.i0.e r10 = kotlin.p491i0.C11839f.m10272j(r11, r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = r12
            r15 = r10
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r14 = r15
            r11 = 10
            int r9 = kotlin.p557z.C13722p.m3921o(r14, r11)
            r12.<init>(r9)
            r16 = r10
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            r14 = r16
            java.util.Iterator r17 = r14.iterator()
        L43:
            r0 = r17
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L61
            r19 = r17
            kotlin.z.l0 r19 = (kotlin.p557z.AbstractC13711l0) r19
            r18 = r19
            r0 = r18
            int r9 = r0.mo4069b()
            android.view.View r27 = r7.getChildAt(r9)
            r0 = r27
            r13.add(r0)
            goto L43
        L61:
            java.util.ArrayList r20 = new java.util.ArrayList
            r12 = r20
            r11 = 10
            int r9 = kotlin.p557z.C13722p.m3921o(r13, r11)
            r0 = r20
            r0.<init>(r9)
            java.util.Iterator r17 = r13.iterator()
        L74:
            r0 = r17
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L9a
            r0 = r17
            java.lang.Object r3 = r0.next()
            r21 = r3
            android.view.View r21 = (android.view.View) r21
            r27 = r21
            org.org.org.org.asm.Type r25 = org.org.org.org.asm.Type.f32312c
            int r9 = r28 + (-1)
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.String r4 = r0.m1155a(r1, r2, r9)
            r12.add(r4)
            goto L74
        L9a:
            java.util.List r22 = kotlin.p557z.C13722p.m3956O(r12)
            r0 = r22
            java.lang.Object r3 = kotlin.p557z.C13722p.m3952T(r0)
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            r4 = r23
            return r4
        Lab:
            r24 = 0
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Type.m1155a(int, android.view.View, int):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m1153a(View view) {
        Serializable $r8;
        Object $r9;
        boolean $z0 = C14619f.m1035b(view);
        if ($z0) {
            TabLayout.C4745g $r4 = put(view);
            View $r2 = check(view);
            String $r3 = $r2 != null ? create($r2) : null;
            if ($r3 == null) {
                $r3 = TabLayout.class.getSimpleName();
            }
            Object[] $r1 = new Object[3];
            $r1[0] = $r3;
            Object $r6 = "-";
            if ($r4 != null) {
                int $i0 = $r4.m26518h();
                $r8 = Integer.valueOf($i0);
            } else {
                $r8 = "-";
            }
            $r1[1] = $r8;
            if ($r4 != null && ($r9 = $r4.m26516j()) != null) {
                $r6 = $r9;
            }
            $r1[2] = $r6;
            String $r32 = String.format("%s position=[%s] tag=[%s]", Arrays.copyOf($r1, 3));
            Log_OC.loadImage($r32, "java.lang.String.format(format, *args)");
            return $r32;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ String m1148a(Type type, View view, boolean $z0, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = true;
        }
        String $r2 = type.m1151a(view, $z0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x002d */
    /* JADX WARN: Incorrect condition in loop: B:19:0x0049 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m1147a(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r14.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L20
            r4 = r14[r3]
            org.org.org.org.asm.Attribute r5 = org.org.org.org.asm.Attribute.f32301a
            android.view.View r6 = r5.get(r4)     // Catch: java.lang.Exception -> L58
            goto L18
        L17:
            r6 = 0
        L18:
            if (r6 == 0) goto L1d
            r1.add(r6)
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r1.iterator()
        L29:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L41
            java.lang.Object r4 = r8.next()
            r10 = r4
            android.view.View r10 = (android.view.View) r10
            r6 = r10
            boolean r9 = r6.isShown()
            if (r9 == 0) goto L29
            r7.add(r4)
            goto L29
        L41:
            java.util.Iterator r8 = r7.iterator()
        L45:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L57
            java.lang.Object r4 = r8.next()
            r11 = r4
            android.view.View r11 = (android.view.View) r11
            r6 = r11
            r0.add(r6)
            goto L45
        L57:
            return r0
        L58:
            r12 = move-exception
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Type.m1147a(java.lang.Object[]):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final List m1146a(Object[] objArr, WindowManager.LayoutParams[] layoutParamsArr) throws NoSuchFieldException, IllegalAccessException {
        ArrayList $r3 = new ArrayList();
        int $i0 = objArr.length;
        int $i2 = 0;
        int $i3 = 0;
        while ($i2 < $i0) {
            Object $r4 = objArr[$i2];
            int $i1 = $i3 + 1;
            Attribute $r5 = Attribute.f32301a;
            View $r6 = $r5.get($r4);
            if ($r6 != null) {
                boolean $z0 = $r6.isShown();
                if ($z0) {
                    Type $r0 = f32312c;
                    Rect $r8 = $r0.get($r6);
                    WindowManager.LayoutParams $r9 = layoutParamsArr[$i3];
                    Object $r42 = $r0.add($r6);
                    C14590m $r7 = new C14590m($r6, $r8, $r9, $r42);
                    $r3.add($r7);
                }
            }
            $i2++;
            $i3 = $i1;
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m1149a(List list) {
        int $i0 = list.size();
        if ($i0 <= 1) {
            return;
        }
        int $i1 = list.size();
        int $i12 = $i1 - 1;
        for (int $i02 = 0; $i02 < $i12; $i02++) {
            Object $r2 = list.get($i02);
            C14590m $r3 = (C14590m) $r2;
            boolean $z0 = $r3.m1122a();
            if ($z0) {
                Context $r4 = $r3.m1121b();
                Activity $r5 = get($r4);
                if ($r5 == null) {
                    return;
                }
                int $i2 = $i02 + 1;
                int $i3 = list.size();
                while (true) {
                    if ($i2 < $i3) {
                        Object $r22 = list.get($i2);
                        C14590m $r32 = (C14590m) $r22;
                        boolean $z02 = $r32.isEnabled();
                        if ($z02) {
                            Context $r42 = $r32.m1121b();
                            Activity $r6 = get($r42);
                            if ($r6 == $r5) {
                                list.remove($r32);
                                list.add($i02, $r32);
                                break;
                            }
                        }
                        $i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Object add(View view) {
        Attribute $r2 = Attribute.f32301a;
        Window $r3 = $r2.m1168a(view);
        if ($r3 == null) {
            PopupWindow $r4 = $r2.get(view);
            return $r4;
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final String m1145b(View view) {
        Object $r4;
        boolean $z0 = view.hasOnClickListeners();
        if ($z0) {
            ClassWriter $r3 = ClassWriter.f32305c;
            try {
                Object $r42 = $r3.get("mListenerInfo", view);
                if ($r42 == null || ($r4 = $r3.get("mOnClickListener", $r42)) == null) {
                    return null;
                }
                String $r5 = (String) $r3.get("mMethodName", $r4);
                return $r5;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View check(View view) {
        for (int $i0 = 0; $i0 < 3; $i0++) {
            ViewParent $r1 = view.getParent();
            if ($r1 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                throw $r4;
            }
            View $r3 = (View) $r1;
            boolean $z0 = $r3 instanceof TabLayout;
            if ($z0) {
                return $r3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List create(ViewGroup viewGroup, int i, int i2) {
        ArrayList $r1 = new ArrayList();
        View $r3 = m1150a(viewGroup, i, i2);
        while ($r3 != null) {
            $r1.add($r3);
            boolean $z0 = $r3 instanceof ViewGroup;
            if (!$z0) {
                return $r1;
            }
            ViewGroup $r2 = (ViewGroup) $r3;
            $r3 = m1150a($r2, i, i2);
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    private final boolean m1144f(View view) {
        boolean $z0 = view.hasOnClickListeners();
        if ($z0) {
            return true;
        }
        boolean $z02 = Log_OC.append("nativeapp", "nativeapp");
        if ($z02) {
            boolean $z03 = C14619f.m1035b(view);
            if ($z03) {
                return true;
            }
            boolean $z04 = C14619f.set(view);
            return $z04;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Activity get(Context context) {
        while (context != null) {
            boolean $z0 = context instanceof Activity;
            if ($z0) {
                Activity $r2 = (Activity) context;
                return $r2;
            }
            boolean $z02 = context instanceof ContextWrapper;
            if (!$z02) {
                return null;
            }
            boolean $z03 = context instanceof Application;
            if ($z03) {
                return null;
            }
            ContextWrapper $r3 = (ContextWrapper) context;
            context = $r3.getBaseContext();
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean get(int i, int i2, View view) {
        Rect $r2 = get(view);
        boolean $z0 = $r2.contains(i, i2);
        if ($z0) {
            return true;
        }
        int $i2 = i - 30;
        boolean $z02 = $r2.contains($i2, i2);
        if ($z02) {
            return true;
        }
        int $i22 = i2 - 30;
        boolean $z03 = $r2.contains(i, $i22);
        if ($z03) {
            return true;
        }
        int $i23 = i + 30;
        boolean $z04 = $r2.contains($i23, i2);
        if ($z04) {
            return true;
        }
        int $i1 = i2 + 30;
        boolean $z05 = $r2.contains(i, $i1);
        return $z05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getValue(View view) {
        int $i0 = C7206R.C7208id.smartlook_custom_name;
        Object $r2 = view.getTag($i0);
        if ($r2 != null) {
            String $r3 = $r2.toString();
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TabLayout.C4745g put(View view) {
        ClassWriter $r4 = ClassWriter.f32305c;
        try {
            Object $r1 = $r4.get("tab", view);
            if ($r1 != null) {
                TabLayout.C4745g $r5 = (TabLayout.C4745g) $r1;
                return $r5;
            }
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type com.google.android.material.tabs.TabLayout.Tab");
            throw $r6;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m1152a(android.view.View r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            boolean r1 = r12 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L47
            r4 = r12
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3 = r4
            java.util.List r5 = r11.create(r3, r13, r14)
            java.util.Iterator r6 = r5.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r7 = r6.next()
            r8 = r7
            android.view.View r8 = (android.view.View) r8
            r12 = r8
            org.org.org.org.asm.Type r11 = org.org.org.org.asm.Type.f32312c
            boolean r1 = r11.m1144f(r12)
            if (r1 == 0) goto L16
            r2 = r12
            goto L16
        L2e:
            if (r2 != 0) goto L4e
            boolean r1 = r5.isEmpty()
            r9 = 1
            r1 = r1 ^ r9
            if (r1 == 0) goto L4e
            int r13 = r5.size()
            int r13 = r13 + (-1)
            java.lang.Object r7 = r5.get(r13)
            r10 = r7
            android.view.View r10 = (android.view.View) r10
            r12 = r10
            return r12
        L47:
            boolean r1 = r11.get(r13, r14, r12)
            if (r1 == 0) goto L4e
            return r12
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Type.m1152a(android.view.View, int, int):android.view.View");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1151a(View view, boolean z) {
        Log_OC.getArray(view, "view");
        String $r2 = z ? getValue(view) : null;
        if ($r2 == null) {
            $r2 = create(view);
        }
        if ($r2 == null) {
            $r2 = m1145b(view);
        }
        if ($r2 == null) {
            $r2 = m1153a(view);
        }
        return $r2 != null ? $r2 : "-";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final List m1154a(Activity activity) {
        Log_OC.getArray(activity, "activity");
        Attribute $r3 = Attribute.f32301a;
        try {
            Object $r4 = $r3.get(activity);
            if ($r4 == null) {
                ArrayList r8 = f32311b;
                return r8;
            }
            Object[] $r5 = $r3.m1167a($r4);
            if ($r5 == null) {
                ArrayList r82 = f32311b;
                return r82;
            }
            WindowManager.LayoutParams[] $r6 = $r3.read($r4);
            if ($r6 == null) {
                ArrayList r83 = f32311b;
                return r83;
            }
            List $r7 = m1146a($r5, $r6);
            boolean $z0 = $r7.isEmpty();
            if ($z0) {
                ArrayList r84 = f32311b;
                return r84;
            }
            m1149a($r7);
            return $r7;
        } catch (Exception e) {
            ArrayList r85 = f32311b;
            return r85;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List add(Activity activity) {
        Log_OC.getArray(activity, "activity");
        Attribute $r3 = Attribute.f32301a;
        try {
            Object $r4 = $r3.get(activity);
            if ($r4 == null) {
                ArrayList $r7 = new ArrayList();
                return $r7;
            }
            Object[] $r5 = $r3.m1167a($r4);
            if ($r5 != null) {
                List $r6 = m1147a($r5);
                return $r6;
            }
            ArrayList $r72 = new ArrayList();
            return $r72;
        } catch (Exception e) {
            ArrayList $r73 = new ArrayList();
            return $r73;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean call(View view) {
        boolean $z0 = view instanceof EditText;
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String create(View view) {
        List $r7;
        if (view == null) {
            return null;
        }
        int $i0 = view.getId();
        if ($i0 <= 10) {
            return null;
        }
        try {
            Context $r3 = view.getContext();
            Log_OC.loadImage($r3, "view.context");
            Resources $r4 = $r3.getResources();
            int $i02 = view.getId();
            String $r5 = $r4.getResourceName($i02);
            Log_OC.loadImage($r5, "view.context.resources.getResourceName(view.id)");
            String[] $r6 = {"/"};
            $r7 = C13277t.m5383r0($r5, $r6, false, 0, 6, null);
            Object $r8 = C13722p.m3943c0($r7);
            return (String) $r8;
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14544h equals(View view) {
        Log_OC.getArray(view, "view");
        Rect $r1 = show(view);
        C14544h $r3 = new C14544h($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Rect evaluate(Rect rect, Rect rect2) {
        Log_OC.getArray(rect, "rectA");
        Log_OC.getArray(rect2, "rectB");
        int $i1 = rect.left;
        int $i2 = rect2.left;
        int $i12 = Math.min($i1, $i2);
        int $i22 = rect.top;
        int $i0 = rect2.top;
        int $i23 = Math.min($i22, $i0);
        int $i3 = rect.right;
        int $i02 = rect2.right;
        int $i03 = Math.max($i3, $i02);
        int $i32 = rect.bottom;
        int $i4 = rect2.bottom;
        Rect $r3 = new Rect($i12, $i23, $i03, Math.max($i32, $i4));
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Rect get(View view) {
        Log_OC.getArray(view, "view");
        int[] $r3 = remove(view);
        int $i0 = $r3[0];
        int $i1 = $r3[1];
        int $i2 = $r3[0];
        int $i3 = view.getWidth();
        int $i22 = $i2 + $i3;
        int $i32 = $r3[1];
        int $i4 = view.getHeight();
        Rect $r1 = new Rect($i0, $i1, $i22, $i32 + $i4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View get(Activity activity) {
        if (activity != null) {
            try {
                View $r1 = activity.findViewById(16908290);
                return $r1;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View get(View $r1, int i, int i2) {
        boolean $z0 = $r1 instanceof ViewGroup;
        if ($z0) {
            ViewGroup $r2 = (ViewGroup) $r1;
            List $r3 = create($r2, i, i2);
            Object $r4 = C13722p.m3940e0($r3);
            return (View) $r4;
        } else if ($r1 != null) {
            boolean $z02 = get(i, i2, $r1);
            if ($z02) {
                return $r1;
            }
            return null;
        } else {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int[] getData(View view) {
        Log_OC.getArray(view, "view");
        int[] $r2 = new int[2];
        view.getLocationInWindow($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getType(Activity activity) {
        Class $r5;
        boolean $z0 = activity instanceof SmartlookNamedController;
        if ($z0) {
            SmartlookNamedController $r2 = (SmartlookNamedController) activity;
            return $r2.getCustomName();
        }
        int $i0 = C7206R.C7208id.smartlook_custom_controller_name;
        View $r4 = get(activity);
        String $r3 = m1155a($i0, $r4, 3);
        if ($r3 == null) {
            $r3 = (activity == null || ($r5 = activity.getClass()) == null) ? null : $r5.getSimpleName();
        }
        return $r3 != null ? $r3 : "unknown";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getType(Fragment fragment) {
        Class $r5;
        boolean $z0 = fragment instanceof SmartlookNamedController;
        if ($z0) {
            SmartlookNamedController $r2 = (SmartlookNamedController) fragment;
            return $r2.getCustomName();
        }
        int $i0 = C7206R.C7208id.smartlook_custom_controller_name;
        View $r4 = fragment != null ? fragment.getView() : null;
        String $r3 = m1155a($i0, $r4, 3);
        if ($r3 == null) {
            $r3 = (fragment == null || ($r5 = fragment.getClass()) == null) ? null : $r5.getSimpleName();
        }
        return $r3 != null ? $r3 : "unknown";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14544h onSaveInstanceState(View view) {
        Log_OC.getArray(view, "view");
        Rect $r1 = get(view);
        C14544h $r3 = new C14544h($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int[] remove(View view) {
        Log_OC.getArray(view, "view");
        int[] $r2 = new int[2];
        view.getLocationOnScreen($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Point set(View view) {
        Log_OC.getArray(view, "view");
        Point $r3 = new Point();
        Type $r0 = f32312c;
        int[] $r1 = $r0.remove(view);
        int $i0 = $r1[0];
        $r3.x = $i0;
        int $i02 = $r1[1];
        $r3.y = $i02;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Rect show(View view) {
        Log_OC.getArray(view, "view");
        Rect $r2 = new Rect();
        view.getGlobalVisibleRect($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Rect toString(View view) {
        Log_OC.getArray(view, "view");
        int[] $r3 = getData(view);
        int $i0 = $r3[0];
        int $i1 = $r3[1];
        int $i2 = $r3[0];
        int $i3 = view.getWidth();
        int $i22 = $i2 + $i3;
        int $i32 = $r3[1];
        int $i4 = view.getHeight();
        Rect $r1 = new Rect($i0, $i1, $i22, $i32 + $i4);
        return $r1;
    }
}
