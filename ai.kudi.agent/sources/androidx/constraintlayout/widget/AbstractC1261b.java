package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.InterfaceC7567h;
/* compiled from: ConstraintHelper.java */
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1261b extends View {

    /* renamed from: c */
    protected int[] f3850c;

    /* renamed from: d */
    protected int f3851d;

    /* renamed from: e */
    protected Context f3852e;

    /* renamed from: f */
    protected InterfaceC7567h f3853f;

    /* renamed from: w */
    protected boolean f3854w;

    /* renamed from: x */
    protected String f3855x;

    /* renamed from: y */
    protected String f3856y;

    /* renamed from: z */
    private HashMap<Integer, String> f3857z;

    public AbstractC1261b(Context context) {
        super(context);
        this.f3850c = new int[32];
        this.f3854w = false;
        this.f3857z = new HashMap<>();
        this.f3852e = context;
        mo36568h(null);
    }

    /* renamed from: a */
    private void m36629a(String str) {
        if (str == null || str.length() == 0 || this.f3852e == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int m36623g = m36623g(trim);
        if (m36623g != 0) {
            this.f3857z.put(Integer.valueOf(m36623g), trim);
            m36628b(m36623g);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: b */
    private void m36628b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f3851d + 1;
        int[] iArr = this.f3850c;
        if (i2 > iArr.length) {
            this.f3850c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3850c;
        int i3 = this.f3851d;
        iArr2[i3] = i;
        this.f3851d = i3 + 1;
    }

    /* renamed from: c */
    private void m36627c(String str) {
        if (str == null || str.length() == 0 || this.f3852e == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C1255b) && trim.equals(((ConstraintLayout.C1255b) layoutParams).f3779U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m36628b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    private int m36624f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f3852e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private int m36623g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m36624f(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C1275h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f3852e.getResources().getIdentifier(str, "id", this.f3852e.getPackageName()) : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m36626d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m36625e((ConstraintLayout) parent);
    }

    /* renamed from: e */
    protected void m36625e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f3851d; i++) {
            View viewById = constraintLayout.getViewById(this.f3850c[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3850c, this.f3851d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36568h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1276i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3855x = string;
                    setIds(string);
                } else if (index == C1276i.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3856y = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public void mo36622i(C7561e c7561e, boolean z) {
    }

    /* renamed from: j */
    public void mo36621j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m36620k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m36619l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void m36618m(ConstraintLayout constraintLayout) {
        String str;
        int m36624f;
        if (isInEditMode()) {
            setIds(this.f3855x);
        }
        InterfaceC7567h interfaceC7567h = this.f3853f;
        if (interfaceC7567h == null) {
            return;
        }
        interfaceC7567h.mo18162b();
        for (int i = 0; i < this.f3851d; i++) {
            int i2 = this.f3850c[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (m36624f = m36624f(constraintLayout, (str = this.f3857z.get(Integer.valueOf(i2))))) != 0) {
                this.f3850c[i] = m36624f;
                this.f3857z.put(Integer.valueOf(m36624f), str);
                viewById = constraintLayout.getViewById(m36624f);
            }
            if (viewById != null) {
                this.f3853f.mo18164a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f3853f.mo18158c(constraintLayout.mLayoutWidget);
    }

    /* renamed from: n */
    public void m36617n() {
        if (this.f3853f == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C1255b) {
            ((ConstraintLayout.C1255b) layoutParams).f3810m0 = (C7561e) this.f3853f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3855x;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3856y;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f3854w) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f3855x = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f3851d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m36629a(str.substring(i));
                return;
            } else {
                m36629a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f3856y = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f3851d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m36627c(str.substring(i));
                return;
            } else {
                m36627c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3855x = null;
        this.f3851d = 0;
        for (int i : iArr) {
            m36628b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f3855x == null) {
            m36628b(i);
        }
    }

    public AbstractC1261b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3850c = new int[32];
        this.f3854w = false;
        this.f3857z = new HashMap<>();
        this.f3852e = context;
        mo36568h(attributeSet);
    }
}
