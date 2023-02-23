package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.AbstractC1330p;
import androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompatApi23$RequestPermissionsRequestCodeValidator;
import androidx.core.app.C1291a;
import androidx.lifecycle.C1578q;
import androidx.lifecycle.Priority;
import androidx.lifecycle.Scope;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p201g.p254o.p255a.AbstractC7809a;
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat$OnRequestPermissionsResultCallback, ActivityCompatApi23$RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1578q mFragmentLifecycleRegistry;
    final C1503m mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FragmentActivity() {
        i$a $r2 = new i$a(this);
        C1503m $r1 = C1503m.m35705b($r2);
        this.mFragments = $r1;
        C1578q $r3 = new C1578q(this);
        this.mFragmentLifecycleRegistry = $r3;
        this.mStopped = true;
        init();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FragmentActivity(int i) {
        super(i);
        i$a $r2 = new i$a(this);
        C1503m $r1 = C1503m.m35705b($r2);
        this.mFragments = $r1;
        C1578q $r3 = new C1578q(this);
        this.mFragmentLifecycleRegistry = $r3;
        this.mStopped = true;
        init();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void init() {
        SavedStateRegistry $r2 = getSavedStateRegistry();
        C1446a $r1 = new C1446a(this);
        $r2.m34396d(LIFECYCLE_TAG, $r1);
        C1448b $r3 = new C1448b(this);
        addOnContextAvailableListener($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean markState(androidx.fragment.app.FragmentManager r12, androidx.lifecycle.Priority r13) {
        /*
            java.util.List r0 = r12.m35902s0()
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r4 = r1.next()
            r6 = r4
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            r5 = r6
            if (r5 != 0) goto L1a
            goto L9
        L1a:
            java.lang.Object r4 = r5.getHost()
            if (r4 == 0) goto L29
            androidx.fragment.app.FragmentManager r12 = r5.getChildFragmentManager()
            boolean r3 = markState(r12, r13)
            r2 = r2 | r3
        L29:
            androidx.fragment.app.f0 r7 = r5.mViewLifecycleOwner
            if (r7 == 0) goto L43
            androidx.lifecycle.i r8 = r7.getLifecycle()
            androidx.lifecycle.Priority r9 = r8.mo35505b()
            androidx.lifecycle.Priority r10 = androidx.lifecycle.Priority.f4718F
            boolean r3 = r9.m35575c(r10)
            if (r3 == 0) goto L43
            androidx.fragment.app.f0 r7 = r5.mViewLifecycleOwner
            r7.f(r13)
            r2 = 1
        L43:
            androidx.lifecycle.q r11 = r5.mLifecycleRegistry
            androidx.lifecycle.Priority r9 = r11.mo35505b()
            androidx.lifecycle.Priority r10 = androidx.lifecycle.Priority.f4718F
            boolean r3 = r9.m35575c(r10)
            if (r3 == 0) goto L9
            androidx.lifecycle.q r11 = r5.mLifecycleRegistry
            r11.o(r13)
            r2 = 1
            goto L9
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentActivity.markState(androidx.fragment.app.FragmentManager, androidx.lifecycle.Priority):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1503m $r4 = this.mFragments;
        View $r5 = $r4.m35685v(view, str, context, attributeSet);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        int $i0 = System.identityHashCode(this);
        printWriter.print(Integer.toHexString($i0));
        printWriter.println(" State:");
        String $r5 = str + "  ";
        printWriter.print($r5);
        printWriter.print("mCreated=");
        boolean $z0 = this.mCreated;
        printWriter.print($z0);
        printWriter.print(" mResumed=");
        boolean $z02 = this.mResumed;
        printWriter.print($z02);
        printWriter.print(" mStopped=");
        boolean $z03 = this.mStopped;
        printWriter.print($z03);
        Application $r7 = getApplication();
        if ($r7 != null) {
            AbstractC7809a $r8 = AbstractC7809a.b(this);
            $r8.mo17253a($r5, fileDescriptor, printWriter, strArr);
        }
        C1503m $r9 = this.mFragments;
        FragmentManager $r10 = $r9.m35687t();
        $r10.m35969U(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FragmentManager getSupportFragmentManager() {
        C1503m $r2 = this.mFragments;
        FragmentManager $r1 = $r2.m35687t();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC7809a getSupportLoaderManager() {
        AbstractC7809a $r1 = AbstractC7809a.b(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void markFragmentsCreated() {
        boolean $z0;
        do {
            FragmentManager $r2 = getSupportFragmentManager();
            Priority $r1 = Priority.f4721I;
            $z0 = markState($r2, $r1);
        } while ($z0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C1503m $r2 = this.mFragments;
        $r2.m35686u();
        super.onActivityResult(i, i2, intent);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C1503m $r2 = this.mFragments;
        $r2.m35686u();
        super.onConfigurationChanged(configuration);
        C1503m $r22 = this.mFragments;
        $r22.m35703d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1578q $r3 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_CREATE;
        $r3.h($r1);
        C1503m $r4 = this.mFragments;
        $r4.m35701f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            boolean $z0 = super.onCreatePanelMenu(i, menu);
            return $z0;
        }
        boolean $z02 = super.onCreatePanelMenu(i, menu);
        C1503m $r1 = this.mFragments;
        MenuInflater $r3 = getMenuInflater();
        boolean $z1 = $r1.m35700g(menu, $r3);
        return $z02 | $z1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View $r5 = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if ($r5 == null) {
            View $r4 = super.onCreateView(view, str, context, attributeSet);
            return $r4;
        }
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View $r4 = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return $r4 == null ? super.onCreateView(str, context, attributeSet) : $r4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1503m $r2 = this.mFragments;
        $r2.m35699h();
        C1578q $r3 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_DESTROY;
        $r3.h($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C1503m $r1 = this.mFragments;
        $r1.m35698i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean $z0 = super.onMenuItemSelected(i, menuItem);
        if ($z0) {
            return true;
        }
        if (i == 0) {
            C1503m $r2 = this.mFragments;
            boolean $z02 = $r2.m35696k(menuItem);
            return $z02;
        } else if (i != 6) {
            return false;
        } else {
            C1503m $r22 = this.mFragments;
            boolean $z03 = $r22.m35702e(menuItem);
            return $z03;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        C1503m $r1 = this.mFragments;
        $r1.m35697j(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        C1503m $r2 = this.mFragments;
        $r2.m35686u();
        super.onNewIntent(intent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            C1503m $r2 = this.mFragments;
            $r2.m35695l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        C1503m $r2 = this.mFragments;
        $r2.m35694m();
        C1578q $r3 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_PAUSE;
        $r3.h($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        C1503m $r1 = this.mFragments;
        $r1.m35693n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        boolean $z0 = super.onPreparePanel(0, view, menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            boolean $z0 = super.onPreparePanel(i, view, menu);
            return $z0;
        }
        boolean $z02 = onPrepareOptionsPanel(view, menu);
        C1503m $r3 = this.mFragments;
        boolean $z1 = $r3.m35692o(menu);
        return $z02 | $z1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C1503m $r3 = this.mFragments;
        $r3.m35686u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onResume() {
        C1503m $r1 = this.mFragments;
        $r1.m35686u();
        super.onResume();
        this.mResumed = true;
        C1503m $r12 = this.mFragments;
        $r12.m35688s();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void onResumeFragments() {
        C1578q $r2 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_RESUME;
        $r2.h($r1);
        C1503m $r3 = this.mFragments;
        $r3.m35691p();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ Bundle onSaveInstanceState() {
        markFragmentsCreated();
        C1578q $r2 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_STOP;
        $r2.h($r1);
        Bundle $r3 = new Bundle();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ void onSaveInstanceState(Context context) {
        C1503m $r2 = this.mFragments;
        $r2.m35706a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onStart() {
        C1503m $r2 = this.mFragments;
        $r2.m35686u();
        super.onStart();
        this.mStopped = false;
        boolean $z0 = this.mCreated;
        if (!$z0) {
            this.mCreated = true;
            C1503m $r22 = this.mFragments;
            $r22.m35704c();
        }
        C1503m $r23 = this.mFragments;
        $r23.m35688s();
        C1578q $r3 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_START;
        $r3.h($r1);
        C1503m $r24 = this.mFragments;
        $r24.m35690q();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onStateNotSaved() {
        C1503m $r1 = this.mFragments;
        $r1.m35686u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C1503m $r2 = this.mFragments;
        $r2.m35689r();
        C1578q $r3 = this.mFragmentLifecycleRegistry;
        Scope $r1 = Scope.ON_STOP;
        $r3.h($r1);
    }

    public void setEnterSharedElementCallback(AbstractC1330p abstractC1330p) {
        C1291a.m36465r(this, abstractC1330p);
    }

    public void setExitSharedElementCallback(AbstractC1330p abstractC1330p) {
        C1291a.m36464s(this, abstractC1330p);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C1291a.m36462u(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C1291a.m36461v(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C1291a.m36469n(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C1291a.m36468o(this);
    }

    public void supportStartPostponedEnterTransition() {
        C1291a.m36460w(this);
    }

    @Override // androidx.core.app.ActivityCompatApi23$RequestPermissionsRequestCodeValidator
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
