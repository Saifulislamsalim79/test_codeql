package androidx.fragment.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.C1291a;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1566i0;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentActivity.java */
/* loaded from: classes2.dex */
public class i$a extends AbstractC1505o<i> implements androidx.lifecycle.j0, androidx.activity.c, androidx.activity.result.d, androidx.savedstate.c, InterfaceC1521u {

    /* renamed from: w */
    final /* synthetic */ i f4578w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i$a(i iVar) {
        super(iVar);
        this.f4578w = iVar;
    }

    @Override // androidx.fragment.app.InterfaceC1521u
    /* renamed from: a */
    public void mo35612a(FragmentManager fragmentManager, Fragment fragment) {
        this.f4578w.onAttachFragment(fragment);
    }

    @Override // androidx.fragment.app.AbstractC1505o, androidx.fragment.app.AbstractC1499k
    /* renamed from: c */
    public View mo35680c(int i) {
        return this.f4578w.findViewById(i);
    }

    @Override // androidx.fragment.app.AbstractC1505o, androidx.fragment.app.AbstractC1499k
    /* renamed from: d */
    public boolean mo35679d() {
        Window window = this.f4578w.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public ActivityResultRegistry getActivityResultRegistry() {
        return this.f4578w.getActivityResultRegistry();
    }

    public AbstractC1565i getLifecycle() {
        return this.f4578w.mFragmentLifecycleRegistry;
    }

    public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f4578w.getOnBackPressedDispatcher();
    }

    public SavedStateRegistry getSavedStateRegistry() {
        return this.f4578w.getSavedStateRegistry();
    }

    public C1566i0 getViewModelStore() {
        return this.f4578w.getViewModelStore();
    }

    @Override // androidx.fragment.app.AbstractC1505o
    /* renamed from: h */
    public void mo35675h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4578w.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.AbstractC1505o
    /* renamed from: j */
    public LayoutInflater mo35673j() {
        return this.f4578w.getLayoutInflater().cloneInContext(this.f4578w);
    }

    @Override // androidx.fragment.app.AbstractC1505o
    /* renamed from: l */
    public boolean mo35671l(String str) {
        return C1291a.m36463t(this.f4578w, str);
    }

    @Override // androidx.fragment.app.AbstractC1505o
    /* renamed from: o */
    public void mo35668o() {
        this.f4578w.supportInvalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.AbstractC1505o
    /* renamed from: p */
    public i mo35674i() {
        return this.f4578w;
    }
}
