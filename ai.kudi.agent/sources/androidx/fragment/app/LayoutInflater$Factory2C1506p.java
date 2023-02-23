package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.C1515c;
import p201g.p248l.C7803c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLayoutInflaterFactory.java */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes2.dex */
public class LayoutInflater$Factory2C1506p implements LayoutInflater.Factory2 {

    /* renamed from: c */
    final FragmentManager f4626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC1507a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        final /* synthetic */ C1526y f4627c;

        View$OnAttachStateChangeListenerC1507a(C1526y c1526y) {
            this.f4627c = c1526y;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m35597k = this.f4627c.m35597k();
            this.f4627c.m35595m();
            AbstractC1486i0.m35735n((ViewGroup) m35597k.mView.getParent(), LayoutInflater$Factory2C1506p.this.f4626c).m35739j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C1506p(FragmentManager fragmentManager) {
        this.f4626c = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1526y m35900t;
        if (C1501l.class.getName().equals(str)) {
            return new C1501l(context, attributeSet, this.f4626c);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7803c.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(C7803c.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(C7803c.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(C7803c.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !C1504n.m35683b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment m35941f0 = resourceId != -1 ? this.f4626c.m35941f0(resourceId) : null;
            if (m35941f0 == null && string != null) {
                m35941f0 = this.f4626c.m35938g0(string);
            }
            if (m35941f0 == null && id != -1) {
                m35941f0 = this.f4626c.m35941f0(id);
            }
            if (m35941f0 == null) {
                m35941f0 = this.f4626c.m35905r0().mo35684a(context.getClassLoader(), attributeValue);
                m35941f0.mFromLayout = true;
                m35941f0.mFragmentId = resourceId != 0 ? resourceId : id;
                m35941f0.mContainerId = id;
                m35941f0.mTag = string;
                m35941f0.mInLayout = true;
                FragmentManager fragmentManager = this.f4626c;
                m35941f0.mFragmentManager = fragmentManager;
                m35941f0.mHost = fragmentManager.m35899t0();
                m35941f0.onInflate(this.f4626c.m35899t0().m35677f(), attributeSet, m35941f0.mSavedFragmentState);
                m35900t = this.f4626c.m35945e(m35941f0);
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "Fragment " + m35941f0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!m35941f0.mInLayout) {
                m35941f0.mInLayout = true;
                FragmentManager fragmentManager2 = this.f4626c;
                m35941f0.mFragmentManager = fragmentManager2;
                m35941f0.mHost = fragmentManager2.m35899t0();
                m35941f0.onInflate(this.f4626c.m35899t0().m35677f(), attributeSet, m35941f0.mSavedFragmentState);
                m35900t = this.f4626c.m35900t(m35941f0);
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + m35941f0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            C1515c.m35640i(m35941f0, viewGroup);
            m35941f0.mContainer = viewGroup;
            m35900t.m35595m();
            m35900t.m35598j();
            View view2 = m35941f0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m35941f0.mView.getTag() == null) {
                    m35941f0.mView.setTag(string);
                }
                m35941f0.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1507a(m35900t));
                return m35941f0.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
