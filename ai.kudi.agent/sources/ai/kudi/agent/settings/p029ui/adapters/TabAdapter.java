package ai.kudi.agent.settings.p029ui.adapters;

import androidx.fragment.app.AbstractC1522v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
/* compiled from: TabAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TabAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "behavior", "", "titles", "", "", "(Landroidx/fragment/app/FragmentManager;ILjava/util/List;)V", "pages", "", "Landroidx/fragment/app/Fragment;", "getCount", "getItem", "position", "getPageTitle", "", "setPages", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.TabAdapter */
/* loaded from: classes.dex */
public final class TabAdapter extends AbstractC1522v {
    private List<? extends Fragment> pages;
    private List<String> titles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TabAdapter(FragmentManager fragmentManager, int i, List list) {
        super(fragmentManager, i);
        List $r1;
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(list, "titles");
        this.titles = list;
        $r1 = C13726r.m3891e();
        this.pages = $r1;
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
        Fragment $r3 = (Fragment) $r2;
        if ($r3 == null) {
            Object $r22 = C13722p.m3954R($r1);
            return (Fragment) $r22;
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public CharSequence getPageTitle(int i) {
        List $r1 = this.titles;
        Object $r2 = $r1.get(i);
        CharSequence $r3 = (CharSequence) $r2;
        return $r3;
    }

    public final void setPages(List list) {
        Log_OC.getArray(list, "pages");
        this.pages = list;
    }
}
