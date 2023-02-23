package ai.kudi.agent.core.domain.converters;

import ai.kudi.agent.core.domain.data.Merchant;
import ai.kudi.agent.core.domain.data.PublicProfile;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import com.google.gson.C6784f;
import com.google.gson.p184v.C6916a;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PublicProfileConverter.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/domain/converters/PublicProfileConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "toList", "Lai/kudi/agent/core/domain/data/PublicProfile;", TransactionBreakDownItemType.DATA, "", "toString", "publicProfile", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PublicProfileConverter {
    private final C6784f gson;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PublicProfileConverter() {
        C6784f $r1 = new C6784f();
        this.gson = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C6784f getGson() {
        C6784f r1 = this.gson;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PublicProfile toList(String str) {
        Log_OC.getArray(str, TransactionBreakDownItemType.DATA);
        Type $r3 = new C6916a<Merchant>() { // from class: ai.kudi.agent.core.domain.converters.PublicProfileConverter$toList$listType$1
        }.getType();
        Log_OC.loadImage($r3, "object : TypeToken<Merchant>() {}.type");
        C6784f $r4 = this.gson;
        Object $r5 = $r4.m20759m(str, $r3);
        Log_OC.loadImage($r5, "gson.fromJson(data, listType)");
        PublicProfile $r6 = (PublicProfile) $r5;
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(PublicProfile publicProfile) {
        Log_OC.getArray(publicProfile, "publicProfile");
        C6784f $r3 = this.gson;
        String $r1 = $r3.m20751u(publicProfile);
        Log_OC.loadImage($r1, "gson.toJson(publicProfile)");
        return $r1;
    }
}
