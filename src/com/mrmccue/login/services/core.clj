(ns com.mrmccue.login.services.core)

(defprotocol Service
  "A service for which we can login and log out."
  (login [this credentials]
    "Uses the given credentials to produce cookie information
    for a session on that service. The shape of the credentials
    varies from service to service. Should raise an
    IllegalArgumentException if the shape of the credentials is
    incorrect for the implementation of the service")
  (logout [this session-info]
    "Uses the session info to manually log out of the service.
    Similar to login, the shape of session-info is specific to
    the service and the service should raise an
    IllegalArgumentException if it gets incorrectly shaped data."))


(defmacro required-str
  "Throws an IllegalArgumentException if the given string doesn't exist.
  Useful for fulfilling the contract of the service protocol"
  [sym]
  `(when (or (nil? ~sym) (not (string? ~sym)))
     (throw
       (IllegalArgumentException.
         (str "Required string value missing: " ~(str sym))))))
