package ai.kudi.agent.core.util;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1567j;
import androidx.lifecycle.C1577p;
import androidx.lifecycle.PreferenceActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: FragmentExtension.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\u001a\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\f"}, m10421d2 = {"dismissWhenResumed", "", "Landroidx/fragment/app/DialogFragment;", "parentFragment", "Landroidx/fragment/app/Fragment;", "requireAppCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "showDialogWhenResumed", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentExtensionKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void dismissWhenResumed(Chapter chapter, Fragment fragment) {
        Log_OC.getArray(chapter, "<this>");
        Log_OC.getArray(fragment, "parentFragment");
        PreferenceActivity $r2 = fragment.getViewLifecycleOwner();
        Log_OC.loadImage($r2, "parentFragment.viewLifecycleOwner");
        AbstractC1567j $r3 = C1577p.a($r2);
        FragmentExtensionKt$dismissWhenResumed$1 $r4 = new FragmentExtensionKt$dismissWhenResumed$1(chapter, null);
        $r3.m35512b($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final AppCompatActivity requireAppCompatActivity(Fragment fragment) {
        Log_OC.getArray(fragment, "<this>");
        FragmentActivity $r0 = fragment.requireActivity();
        AppCompatActivity $r2 = (AppCompatActivity) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void showDialogWhenResumed(Chapter chapter, FragmentManager fragmentManager, String str, Fragment fragment) {
        Log_OC.getArray(chapter, "<this>");
        Log_OC.getArray(fragmentManager, "fragmentManager");
        Log_OC.getArray(str, "tag");
        Log_OC.getArray(fragment, "parentFragment");
        PreferenceActivity $r4 = fragment.getViewLifecycleOwner();
        Log_OC.loadImage($r4, "parentFragment.viewLifecycleOwner");
        AbstractC1567j $r5 = C1577p.a($r4);
        FragmentExtensionKt$showDialogWhenResumed$1 $r6 = new FragmentExtensionKt$showDialogWhenResumed$1(chapter, fragmentManager, str, null);
        $r5.m35512b($r6);
    }
}
