package ai.kudi.agent.register.data.sources;

import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: DataSource.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/register/data/sources/DataSource;", "", "load", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "save", "Lio/reactivex/Observable;", "agentInfo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DataSource {
    RegistrationInfo load();

    AbstractC11688p save(RegistrationInfo registrationInfo);
}
