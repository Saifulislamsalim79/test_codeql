package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0929b;
import androidx.appcompat.widget.C1168w0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C1291a;
import androidx.core.app.C1312i;
import androidx.core.app.C1332q;
import androidx.core.app.TaskStackBuilder$SupportParentable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1571k0;
import androidx.lifecycle.C1573l0;
import androidx.savedstate.C1869d;
import androidx.savedstate.SavedStateRegistry;
import p201g.p202a.p209o.AbstractC7485b;
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, TaskStackBuilder$SupportParentable, ActionBarDrawerToggle$DelegateProvider {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
        initDelegate();
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initDelegate() {
        SavedStateRegistry $r2 = getSavedStateRegistry();
        e$a $r1 = new e$a(this);
        $r2.m34396d(DELEGATE_TAG, $r1);
        e$b $r3 = new e$b(this);
        addOnContextAvailableListener($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initViewTreeOwners() {
        Window $r1 = getWindow();
        View $r2 = $r1.getDecorView();
        C1571k0.a($r2, this);
        Window $r12 = getWindow();
        View $r22 = $r12.getDecorView();
        C1573l0.a($r22, this);
        Window $r13 = getWindow();
        View $r23 = $r13.getDecorView();
        C1869d.a($r23, this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window $r2;
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 26) {
            boolean $z0 = keyEvent.isCtrlPressed();
            if ($z0) {
                return false;
            }
            int $i02 = keyEvent.getMetaState();
            boolean $z02 = KeyEvent.metaStateHasNoModifiers($i02);
            if ($z02) {
                return false;
            }
            int $i03 = keyEvent.getRepeatCount();
            if ($i03 == 0) {
                int $i04 = keyEvent.getKeyCode();
                boolean $z03 = KeyEvent.isModifierKey($i04);
                if ($z03 || ($r2 = getWindow()) == null) {
                    return false;
                }
                View $r3 = $r2.getDecorView();
                if ($r3 != null) {
                    View $r32 = $r2.getDecorView();
                    boolean $z04 = $r32.dispatchKeyShortcutEvent(keyEvent);
                    return $z04;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        AppCompatDelegate $r3 = getDelegate();
        $r3.addContentView(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        AppCompatDelegate $r2 = getDelegate();
        Context $r1 = $r2.wrap(context);
        super.attachBaseContext($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0925a $r1 = getSupportActionBar();
        Window $r2 = getWindow();
        boolean $z0 = $r2.hasFeature(0);
        if ($z0) {
            if ($r1 != null) {
                boolean $z02 = $r1.mo37646g();
                if ($z02) {
                    return;
                }
            }
            super.closeOptionsMenu();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.core.app.BaseListFragment, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int $i0 = keyEvent.getKeyCode();
        AbstractC0925a $r2 = getSupportActionBar();
        if ($i0 == 82 && $r2 != null) {
            boolean $z0 = $r2.mo37643q(keyEvent);
            if ($z0) {
                return true;
            }
        }
        boolean $z02 = super.dispatchKeyEvent(keyEvent);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public View findViewById(int i) {
        AppCompatDelegate $r1 = getDelegate();
        View $r2 = $r1.findViewById(i);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate $r1 = this.mDelegate;
        if ($r1 == null) {
            AppCompatDelegate $r12 = AppCompatDelegate.create(this, this);
            this.mDelegate = $r12;
        }
        AppCompatDelegate $r13 = this.mDelegate;
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.ActionBarDrawerToggle$DelegateProvider
    public C0929b.InterfaceC0931b getDrawerToggleDelegate() {
        AppCompatDelegate $r1 = getDelegate();
        C0929b.InterfaceC0931b $r2 = $r1.getDrawerToggleDelegate();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        AppCompatDelegate $r1 = getDelegate();
        MenuInflater $r2 = $r1.getMenuInflater();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null) {
            boolean $z0 = C1168w0.m36906c();
            if ($z0) {
                Resources r3 = new C1168w0(this, super.getResources());
                this.mResources = r3;
            }
        }
        Resources $r1 = this.mResources;
        return $r1 == null ? super.getResources() : $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC0925a getSupportActionBar() {
        AppCompatDelegate $r1 = getDelegate();
        AbstractC0925a $r2 = $r1.getSupportActionBar();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.core.app.TaskStackBuilder$SupportParentable
    public Intent getSupportParentActivityIntent() {
        Intent $r1 = C1312i.m36433a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        AppCompatDelegate $r1 = getDelegate();
        $r1.invalidateOptionsMenu();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Resources $r2 = this.mResources;
        if ($r2 != null) {
            Resources $r22 = super.getResources();
            DisplayMetrics $r3 = $r22.getDisplayMetrics();
            Resources $r23 = this.mResources;
            $r23.updateConfiguration(configuration, $r3);
        }
        AppCompatDelegate $r4 = getDelegate();
        $r4.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C1332q c1332q) {
        c1332q.m36335e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AppCompatDelegate $r1 = getDelegate();
        $r1.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean $z0 = performMenuItemShortcut(keyEvent);
        if ($z0) {
            return true;
        }
        boolean $z02 = super.onKeyDown(i, keyEvent);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean $z0 = super.onMenuItemSelected(i, menuItem);
        if ($z0) {
            return true;
        }
        AbstractC0925a $r2 = getSupportActionBar();
        int $i0 = menuItem.getItemId();
        if ($i0 != 16908332 || $r2 == null) {
            return false;
        }
        int $i02 = $r2.mo37609j();
        if (($i02 & 4) != 0) {
            boolean $z02 = onSupportNavigateUp();
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        boolean $z0 = super.onMenuOpened(i, menu);
        return $z0;
    }

    protected void onNightModeChanged(int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AppCompatDelegate $r2 = getDelegate();
        $r2.onPostCreate(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        AppCompatDelegate $r1 = getDelegate();
        $r1.onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(C1332q c1332q) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        AppCompatDelegate $r1 = getDelegate();
        $r1.setTitle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        AppCompatDelegate $r1 = getDelegate();
        $r1.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(AbstractC7485b abstractC7485b) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(AbstractC7485b abstractC7485b) {
    }

    public void onSupportContentChanged() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        Intent $r2 = getSupportParentActivityIntent();
        if ($r2 != null) {
            boolean $z0 = supportShouldUpRecreateTask($r2);
            if (!$z0) {
                supportNavigateUpTo($r2);
                return true;
            }
            C1332q $r3 = C1332q.m36333h(this);
            onCreateSupportNavigateUpTaskStack($r3);
            onPrepareSupportNavigateUpTaskStack($r3);
            $r3.m36332k();
            try {
                C1291a.m36470m(this);
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        AppCompatDelegate $r2 = getDelegate();
        $r2.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public AbstractC7485b onWindowStartingSupportActionMode(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0925a $r1 = getSupportActionBar();
        Window $r2 = getWindow();
        boolean $z0 = $r2.hasFeature(0);
        if ($z0) {
            if ($r1 != null) {
                boolean $z02 = $r1.mo37642r();
                if ($z02) {
                    return;
                }
            }
            super.openOptionsMenu();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        AppCompatDelegate $r1 = getDelegate();
        $r1.setContentView(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        AppCompatDelegate $r2 = getDelegate();
        $r2.setContentView(view);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        AppCompatDelegate $r3 = getDelegate();
        $r3.setContentView(view, layoutParams);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setSupportActionBar(Toolbar toolbar) {
        AppCompatDelegate $r2 = getDelegate();
        $r2.setSupportActionBar(toolbar);
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        AppCompatDelegate $r1 = getDelegate();
        $r1.setTitle(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC7485b startSupportActionMode(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        AppCompatDelegate $r2 = getDelegate();
        AbstractC7485b $r3 = $r2.m37803a(interfaceC7486a);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        AppCompatDelegate $r1 = getDelegate();
        $r1.invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent) {
        C1312i.m36429e(this, intent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean supportRequestWindowFeature(int i) {
        AppCompatDelegate $r1 = getDelegate();
        boolean $z0 = $r1.requestWindowFeature(i);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean supportShouldUpRecreateTask(Intent intent) {
        boolean $z0 = C1312i.m36428f(this, intent);
        return $z0;
    }
}
