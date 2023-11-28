# Nom du fichier JAR Oracle JDBC (ajustez-le en fonction de votre version)
ORACLE_JAR = lib/ojdbc6.jar

# Répertoire des fichiers source Java
SRC_DIR = src

# Répertoire de compilation
BIN_DIR = bin

# Liste des fichiers source Java
JAVA_FILES = $(wildcard $(SRC_DIR)/*.java)

#Repertoire librairie
LIB_DIR = lib


########################################Pour COnnexion############################""""""

connexion : compileConnexion runConnexion

compileConnexion:
	javac -d $(BIN_DIR) -classpath .:lib/ojdbc6.jar:$(BIN_DIR)/*.class src/*.java

runConnexion:
	java -classpath .:$(LIB_DIR)/*.jar:$(BIN_DIR)/*.class  Connexion


################################pOUR CODE JAVA#################################################

codeJava: compileCodeJava runCodeJava

compileCodeJava:
	javac -d $(BIN_DIR) -classpath .:lib/ojdbc6.jar:$(BIN_DIR)/*.class src/*.java

runCodeJava:
	java -classpath .:$(LIB_DIR)/*.jar:$(BIN_DIR)/*.class  CodeJava
