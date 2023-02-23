package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1571k0;
import androidx.lifecycle.C1573l0;
import androidx.lifecycle.InterfaceC1584v;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C1869d;
/* compiled from: DialogFragment.java */
/* loaded from: classes.dex */
public class Chapter extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private InterfaceC1584v<androidx.lifecycle.o> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Chapter() {
        Runnable r5 = new h$a(this);
        Runnable r9 = r5;
        this.mDismissRunnable = r9;
        DialogInterface.OnCancelListener r6 = new h$b(this);
        DialogInterface.OnCancelListener r10 = r6;
        this.mOnCancelListener = r10;
        DialogInterface.OnDismissListener r7 = new h$c(this);
        DialogInterface.OnDismissListener r11 = r7;
        this.mOnDismissListener = r11;
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        InterfaceC1584v r8 = new h$d(this);
        InterfaceC1584v r12 = r8;
        this.mObserver = r12;
        this.mDialogCreated = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Chapter(int i) {
        super(i);
        Runnable r5 = new h$a(this);
        Runnable r9 = r5;
        this.mDismissRunnable = r9;
        DialogInterface.OnCancelListener r6 = new h$b(this);
        DialogInterface.OnCancelListener r10 = r6;
        this.mOnCancelListener = r10;
        DialogInterface.OnDismissListener r7 = new h$c(this);
        DialogInterface.OnDismissListener r11 = r7;
        this.mOnDismissListener = r11;
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        InterfaceC1584v r8 = new h$d(this);
        InterfaceC1584v r12 = r8;
        this.mObserver = r12;
        this.mDialogCreated = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void dismissInternal(boolean z, boolean z2) {
        boolean $z2 = this.mDismissed;
        if ($z2) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            $r1.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                Looper $r2 = Looper.myLooper();
                Handler $r3 = this.mHandler;
                Looper $r4 = $r3.getLooper();
                if ($r2 == $r4) {
                    onDismiss(this.mDialog);
                } else {
                    Handler $r32 = this.mHandler;
                    Runnable $r5 = this.mDismissRunnable;
                    $r32.post($r5);
                }
            }
        }
        this.mViewDestroyed = true;
        int $i0 = this.mBackStackId;
        if ($i0 >= 0) {
            FragmentManager $r6 = getParentFragmentManager();
            int $i02 = this.mBackStackId;
            $r6.m35964W0($i02, 1, z);
            this.mBackStackId = -1;
            return;
        }
        FragmentManager $r62 = getParentFragmentManager();
        AbstractC1449b0 $r7 = $r62.m35924l();
        $r7.m35818v(true);
        $r7.mo35798q(this);
        if (z) {
            $r7.mo35804j();
        } else {
            $r7.mo35805i();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void prepareDialog(Bundle bundle) {
        boolean $z0 = this.mShowsDialog;
        if ($z0) {
            boolean $z02 = this.mDialogCreated;
            if ($z02) {
                return;
            }
            try {
                this.mCreatingDialog = true;
                Dialog $r2 = onCreateDialog(bundle);
                this.mDialog = $r2;
                boolean $z03 = this.mShowsDialog;
                if ($z03) {
                    int $i0 = this.mStyle;
                    setupDialog($r2, $i0);
                    Context $r3 = getContext();
                    boolean $z04 = $r3 instanceof Activity;
                    if ($z04) {
                        Activity $r4 = (Activity) $r3;
                        this.mDialog.setOwnerActivity($r4);
                    }
                    Dialog $r22 = this.mDialog;
                    boolean $z05 = this.mCancelable;
                    $r22.setCancelable($z05);
                    Dialog $r23 = this.mDialog;
                    DialogInterface.OnCancelListener $r5 = this.mOnCancelListener;
                    $r23.setOnCancelListener($r5);
                    Dialog $r24 = this.mDialog;
                    DialogInterface.OnDismissListener $r6 = this.mOnDismissListener;
                    $r24.setOnDismissListener($r6);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public AbstractC1499k createFragmentContainer() {
        AbstractC1499k $r2 = super.createFragmentContainer();
        h$e $r1 = new h$e(this, $r2);
        return $r1;
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Dialog getDialog() {
        Dialog r1 = this.mDialog;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean getShowsDialog() {
        boolean z0 = this.mShowsDialog;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getTheme() {
        int i0 = this.mTheme;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isCancelable() {
        boolean z0 = this.mCancelable;
        return z0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        LiveData $r2 = getViewLifecycleOwnerLiveData();
        InterfaceC1584v $r1 = this.mObserver;
        $r2.observeForever($r1);
        boolean $z0 = this.mShownByMe;
        if ($z0) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Handler $r2 = new Handler();
        this.mHandler = $r2;
        int $i0 = this.mContainerId;
        boolean $z0 = $i0 == 0;
        this.mShowsDialog = $z0;
        if (bundle != null) {
            int $i02 = bundle.getInt(SAVED_STYLE, 0);
            this.mStyle = $i02;
            int $i03 = bundle.getInt(SAVED_THEME, 0);
            this.mTheme = $i03;
            boolean $z02 = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mCancelable = $z02;
            boolean $z03 = this.mShowsDialog;
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, $z03);
            int $i04 = bundle.getInt(SAVED_BACK_STACK_ID, -1);
            this.mBackStackId = $i04;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Dialog onCreateDialog(Bundle bundle) {
        boolean $z0 = FragmentManager.m35996G0(3);
        if ($z0) {
            String $r3 = "onCreateDialog called for DialogFragment " + this;
            Log.d("FragmentManager", $r3);
        }
        Context $r5 = requireContext();
        int $i0 = getTheme();
        Dialog $r4 = new Dialog($r5, $i0);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            this.mViewDestroyed = true;
            $r1.setOnDismissListener(null);
            this.mDialog.dismiss();
            boolean $z0 = this.mDismissed;
            if (!$z0) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        boolean $z0 = this.mShownByMe;
        if (!$z0) {
            boolean $z02 = this.mDismissed;
            if (!$z02) {
                this.mDismissed = true;
            }
        }
        LiveData $r2 = getViewLifecycleOwnerLiveData();
        InterfaceC1584v $r1 = this.mObserver;
        $r2.removeObserver($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDismiss(DialogInterface dialogInterface) {
        boolean $z0 = this.mViewDestroyed;
        if ($z0) {
            return;
        }
        boolean $z02 = FragmentManager.m35996G0(3);
        if ($z02) {
            String $r3 = "onDismiss called for DialogFragment " + this;
            Log.d("FragmentManager", $r3);
        }
        dismissInternal(true, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    View onFindViewById(int i) {
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            View $r2 = $r1.findViewById(i);
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater $r2 = super.onGetLayoutInflater(bundle);
        boolean $z0 = this.mShowsDialog;
        if ($z0) {
            boolean $z02 = this.mCreatingDialog;
            if (!$z02) {
                prepareDialog(bundle);
                boolean $z03 = FragmentManager.m35996G0(2);
                if ($z03) {
                    Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
                }
                Dialog $r5 = this.mDialog;
                if ($r5 != null) {
                    Context $r6 = $r5.getContext();
                    return $r2.cloneInContext($r6);
                }
                return $r2;
            }
        }
        boolean $z04 = FragmentManager.m35996G0(2);
        if ($z04) {
            String $r4 = "getting layout inflater for DialogFragment " + this;
            boolean $z05 = this.mShowsDialog;
            if (!$z05) {
                Log.d("FragmentManager", "mShowsDialog = false: " + $r4);
                return $r2;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + $r4);
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    boolean onHasView() {
        boolean z0 = this.mDialogCreated;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog $r3 = this.mDialog;
        if ($r3 != null) {
            Bundle $r2 = $r3.onSaveInstanceState();
            $r2.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, $r2);
        }
        int $i0 = this.mStyle;
        if ($i0 != 0) {
            bundle.putInt(SAVED_STYLE, $i0);
        }
        int $i02 = this.mTheme;
        if ($i02 != 0) {
            bundle.putInt(SAVED_THEME, $i02);
        }
        boolean $z0 = this.mCancelable;
        if (!$z0) {
            bundle.putBoolean(SAVED_CANCELABLE, $z0);
        }
        boolean $z02 = this.mShowsDialog;
        if (!$z02) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, $z02);
        }
        int $i03 = this.mBackStackId;
        if ($i03 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, $i03);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            this.mViewDestroyed = false;
            $r1.show();
            Window $r2 = this.mDialog.getWindow();
            View $r3 = $r2.getDecorView();
            C1571k0.a($r3, this);
            C1573l0.a($r3, this);
            C1869d.a($r3, this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            $r1.hide();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle $r1;
        super.onViewStateRestored(bundle);
        Dialog $r2 = this.mDialog;
        if ($r2 == null || bundle == null || ($r1 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        Dialog $r22 = this.mDialog;
        $r22.onRestoreInstanceState($r1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle $r1;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        View $r4 = this.mView;
        if ($r4 == null) {
            Dialog $r5 = this.mDialog;
            if ($r5 == null || bundle == null || ($r1 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
                return;
            }
            Dialog $r52 = this.mDialog;
            $r52.onRestoreInstanceState($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Dialog requireDialog() {
        Dialog $r1 = getDialog();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "DialogFragment " + this + " does not have a Dialog.";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog $r1 = this.mDialog;
        if ($r1 != null) {
            $r1.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setStyle(int i, int i2) {
        boolean $z0 = FragmentManager.m35996G0(2);
        if ($z0) {
            String $r2 = "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2;
            Log.d("FragmentManager", $r2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window $r2 = dialog.getWindow();
            if ($r2 != null) {
                $r2.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int show(AbstractC1449b0 abstractC1449b0, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC1449b0.m35826e(this, str);
        this.mViewDestroyed = false;
        int $i0 = abstractC1449b0.mo35805i();
        this.mBackStackId = $i0;
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC1449b0 $r2 = fragmentManager.m35924l();
        $r2.m35818v(true);
        $r2.m35826e(this, str);
        $r2.mo35805i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC1449b0 $r2 = fragmentManager.m35924l();
        $r2.m35818v(true);
        $r2.m35826e(this, str);
        $r2.mo35803k();
    }
}
