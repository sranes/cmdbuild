# cmdbuild version 3.3 - build from source on Windows

# Prerequisite
1. Install Sencha CMD version 6.2.2
2. Add _JAVA_OPTIONS environment variable with value -Xms512m -Xmx2048m
3. Uncompress and install the dependencies by executing install-artifacts file
	

# Changes made for Build
	1. Src/pom.xml
		a. Removed reference to utils/bugreportcollector Module and utils/alfresco-migrator (just commented out for now.
		
	2. Src/parent/pom.xml
		a. Updated maven-jar-plugin.version to 3.0.2 (from 2.6)
		b. Updated maven-war-plugin.version to 3.3.1 (from 2.6)
		c. Updated osgeo entry as below
		      <repository>
			<id>osgeo</id>
			<name>OSGeo Release Repository</name>
			<url>https://repo.osgeo.org/repository/release/</url>
			<snapshots><enabled>false</enabled></snapshots>
			<releases><enabled>true</enabled></releases>
		      </repository>
      
	3. Src/auth/commons/pom.xml
		a. Updated the file path to static path for RolePrivilege and RolePrivilegeAuthority
		b. Updated groovy maven plugin to 2.1.1 (may not be necessary) 
		
	4. Remove reference to Alfresco Migrator as the source is missing from the distribution
		a. Update cli\src\main\java\org\cmdbuild\utils\cli\commands\AlfrescoCommandRunner.java to remove reference to missing classes
		b. update src/cli/pom.xml to remove reference to cmdbuild-utils-alfresco-migrator
	
	5. Src/ui/pom.xml
		a. Updated maven-war-plugin version to 3.3.1 (from 2.6)
		
	6. Src/cmdbuild/pom.xml
		a. Provided static path to groovy scripts
		b. Commented out the cm-git-issues execution
		
	7. Src/utils/quick/pom.xml
		a. Added dependencies for javaxActivation and javax.Annotation 
		<dependency>
			<groupId>com.sun.activation</groupId>
			<artifactId>jakarta.activation</artifactId>
			<version>1.2.2</version>
		</dependency>

		<dependency>
		  <groupId>javax.annotation</groupId>
		  <artifactId>javax.annotation-api</artifactId>
		  <version>1.3.2</version>
		</dependency>
		
	9. Make the below changes as cmdbuild clustering packages are missing required for shark
		a. Src/test/pom.xml
			i. Remove entry for shark module
		b. Src/shark/pom.xml
        		i. Remove enntry for extension-test
