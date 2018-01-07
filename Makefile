.PHONY: deploy
RSYNCARGS := --compress --recursive --checksum --itemize-changes \
	--delete -e ssh --perms --chmod=Dug=rwx,Do=rx,Fug=rw,Fo=r \
	--exclude="Makefile" --exclude="*~" \
	--exclude=".git" --exclude=".gitignore" --exclude=".DS_Store"
DEST := cslinux:/courses/JavaAndDS
deploy:
	rsync $(RSYNCARGS) * $(DEST)
