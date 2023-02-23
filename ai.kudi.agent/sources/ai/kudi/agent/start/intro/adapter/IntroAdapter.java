package ai.kudi.agent.start.intro.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.start.intro.IntroFragment;
import androidx.fragment.app.AbstractC1522v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
/* compiled from: IntroAdapter.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/start/intro/adapter/IntroAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "behavior", "", "(Landroidx/fragment/app/FragmentManager;I)V", "pages", "", "Lai/kudi/agent/start/intro/IntroFragment;", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "position", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IntroAdapter extends AbstractC1522v {
    private final List<IntroFragment> pages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IntroAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        List $r5;
        Log_OC.getArray(fragmentManager, "fm");
        IntroFragment.Companion $r3 = IntroFragment.Companion;
        IntroFragment $r4 = $r3.newInstance(C0001R.C0002drawable.start_splash, C0001R.string.start_intro, C0001R.string.start_intro_description);
        IntroFragment.Companion $r32 = IntroFragment.Companion;
        IntroFragment $r42 = $r32.newInstance(C0001R.C0002drawable.run_splash, C0001R.string.run_splash, C0001R.string.run_splash_subtitle);
        IntroFragment.Companion $r33 = IntroFragment.Companion;
        IntroFragment $r43 = $r33.newInstance(C0001R.C0002drawable.grow_splash, C0001R.string.do_easy_transactions, C0001R.string.do_easy_trans_subtitle);
        IntroFragment[] $r2 = {$r4, $r42, $r43};
        $r5 = C13726r.m3888h($r2);
        this.pages = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public int getCount() {
        List $r1 = this.pages;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.AbstractC1522v
    public Fragment getItem(int i) {
        List $r1 = this.pages;
        Object $r2 = C13722p.m3951U($r1, i);
        IntroFragment $r3 = (IntroFragment) $r2;
        if ($r3 == null) {
            List $r12 = this.pages;
            Object $r22 = C13722p.m3954R($r12);
            Fragment $r4 = (Fragment) $r22;
            return $r4;
        }
        return $r3;
    }
}
