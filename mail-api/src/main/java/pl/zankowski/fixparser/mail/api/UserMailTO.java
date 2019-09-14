package pl.zankowski.fixparser.mail.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = ImmutableUserMailTO.class)
@JsonDeserialize(as = ImmutableUserMailTO.class)
public interface UserMailTO {

    String getUsername();

    String getEmail();

    @Nullable String getActivationKey();

    @Nullable String getResetKey();

}
