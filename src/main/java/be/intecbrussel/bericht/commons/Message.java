package be.intecbrussel.bericht.commons;


public interface Message {

    @SuppressWarnings("all")
    Long getId();

    @SuppressWarnings("all")
    String getMessage();

    @SuppressWarnings("all")
    String getUsername();

    @SuppressWarnings("all")
    void setId(final Long id);

    @SuppressWarnings("all")
    void setMessage(final String message);

    @SuppressWarnings("all")
    void setUsername(final String username);

}
