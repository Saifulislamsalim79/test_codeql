package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimateLayoutChangeDetector.java */
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes2.dex */
public final class C1935a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5842b;

    /* renamed from: a */
    private LinearLayoutManager f5843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: classes2.dex */
    public class C1936a implements Comparator<int[]> {
        C1936a(C1935a c1935a) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5842b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1935a(LinearLayoutManager linearLayoutManager) {
        this.f5843a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m34218a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int m35142T = this.f5843a.m35142T();
        if (m35142T == 0) {
            return true;
        }
        boolean z = this.f5843a.m35389v2() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, m35142T, 2);
        for (int i3 = 0; i3 < m35142T; i3++) {
            View m35145S = this.f5843a.m35145S(i3);
            if (m35145S != null) {
                ViewGroup.LayoutParams layoutParams = m35145S.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5842b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = m35145S.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = m35145S.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = m35145S.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = m35145S.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C1936a(this));
        for (int i4 = 1; i4 < m35142T; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[m35142T - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    /* renamed from: b */
    private boolean m34217b() {
        int m35142T = this.f5843a.m35142T();
        for (int i = 0; i < m35142T; i++) {
            if (m34216c(this.f5843a.m35145S(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m34216c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m34216c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m34215d() {
        return (!m34218a() || this.f5843a.m35142T() <= 1) && m34217b();
    }
}
